/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.thrift;

import java.lang.management.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.net.ssl.SSLServerSocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.concurrent.NamedThreadFactory;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.config.EncryptionOptions.ClientEncryptionOptions;
import org.apache.cassandra.security.SSLFactory;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters;

import com.util.concurrent.Executors;
import com.util.concurrent.PriorityExecutorService;
import com.util.concurrent.PriorityThreadPoolExecutor;
import com.google.common.util.concurrent.Uninterruptibles;
/* This Class Hello Loads the C Library to get the Thread ID */

class Hello {
	private static final Logger logger = LoggerFactory.getLogger(Hello.class);
	public native int HelloWorld();
	static {
		logger.debug("Going to Load the Library");
		try 
		{
			System.loadLibrary("hello");
		}
		catch(Exception e)
		{
			logger.debug("Got an exception in loadLibrary");
		}
	}

	public int returnThread()
	{
		final String[] libraries = GetLibraries.getLoadedLibraries(ClassLoader.getSystemClassLoader());
		logger.debug("CASSANDRA TEAM:List of libraries");
		for (int i=0;i<libraries.length;i++)
			logger.debug(libraries[i]);
		logger.debug("In returnThread of Hello");
		int id = HelloWorld();
		logger.debug("In returnThread after HelloWorld");
		return id;
	}
} 

/* this class gets the list of already loaded libraries. 
we can check if it loaded the library "hello" successfully */

class GetLibraries {
	private static final Logger logger = LoggerFactory.getLogger(Hello.class);
	private static java.lang.reflect.Field LIBRARIES;	
/*	static 
	{
		try 
		{
			LIBRARIES = ClassLoader.class.getDeclaredField("loadedLibraryNames");
			LIBRARIES.setAccessible(true);
		}
		catch(Exception e)
		{
			logger.debug("Exception: ", e);
		}
		finally
		{
		}
	}*/
	public static String[] getLoadedLibraries(final ClassLoader loader) 
	{
		try 
		{
			LIBRARIES = ClassLoader.class.getDeclaredField("loadedLibraryNames");
			LIBRARIES.setAccessible(true);
			 final Vector<String> libraries = (Vector<String>) LIBRARIES.get(loader);
		         return libraries.toArray(new String[] {});
		}
		catch (Exception e)
		{
			logger.debug("Exception: ", e);
			String[] array = new String[1];
			array[0] = "Error";
			return array;
		}
        }
}

/**
 * Slightly modified version of the Apache Thrift TThreadPoolServer.
 * <p/>
 * This allows passing an executor so you have more control over the actual
 * behaviour of the tasks being run.
 * <p/>
 * Newer version of Thrift should make this obsolete.
 */
public class CustomTThreadPoolServer extends TServer
{

    private static final Logger logger = LoggerFactory.getLogger(CustomTThreadPoolServer.class.getName());

    // Executor service for handling client connections
    private final ExecutorService executorService;
    // Flag for stopping the server
    private volatile boolean stopped;
    // This is used to figure if the current client should be a high priority or a low prioirity one 
    public static boolean highPriority ;

    // Server options
    private final TThreadPoolServer.Args args;

    //Track and Limit the number of connected clients
    private final AtomicInteger activeClients = new AtomicInteger(0);

    /*our own PriorityExecutorService */
    PriorityExecutorService priorityExecutor;


    public CustomTThreadPoolServer(TThreadPoolServer.Args args, ExecutorService executorService) {
        super(args);
        this.executorService = executorService;
        this.args = args;
	priorityExecutor = Executors.newPriorityFixedThreadPool(10);
    }

    public void serve()
    {
        try
        {
            serverTransport_.listen();
        }
        catch (TTransportException ttx)
        {
            logger.error("Error occurred during listening.", ttx);
            return;
        }

        stopped = false;
        while (!stopped)
        {
            // block until we are under max clients
            while (activeClients.get() >= args.maxWorkerThreads)
            {
                Uninterruptibles.sleepUninterruptibly(10, TimeUnit.MILLISECONDS);
            }

            try
            {
                TTransport client = serverTransport_.accept();
                activeClients.incrementAndGet();
		logger.debug("CASSANDRA TEAM: going to execute WorkerProcess, number of activeClients {} ExecutorService {}", activeClients.get(), executorService);
		// if this is an "even" client, then it gets a higher priority, i.e, the second client gets a higher one 
		if (activeClients.get()%4==0)
		{
			WorkerProcess wp = new WorkerProcess(client);
			CustomTThreadPoolServer.highPriority=true;
			//the thread runs here when the execute thing is done 
			priorityExecutor.submit(wp, 7);
			logger.debug("CASSANDRA TEAM: even time is " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime()));
		}
		//for the odd one 
		else 
		{
			WorkerProcess wp = new WorkerProcess(client);
			//setting priority here
//			wp.setPriority(1);
			CustomTThreadPoolServer.highPriority=false;
			priorityExecutor.submit(wp, 1);
			logger.debug("CASSANDRA TEAM: odd time is " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime()));
			//executorService.execute(wp);
		}
			
            }
            catch (TTransportException ttx)
            {
                if (ttx.getCause() instanceof SocketTimeoutException) // thrift sucks
                    continue;

                if (!stopped)
                {
                    logger.warn("Transport error occurred during acceptance of message.", ttx);
                }
            }
            catch (RejectedExecutionException e)
            {
                // worker thread decremented activeClients but hadn't finished exiting
                logger.debug("Dropping client connection because our limit of {} has been reached", args.maxWorkerThreads);
                continue;
            }

            if (activeClients.get() >= args.maxWorkerThreads)
                logger.warn("Maximum number of clients " + args.maxWorkerThreads + " reached");
        }

	logger.debug("CASSANDRA TEAM: time before shutdown is " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime()));
        executorService.shutdown();
        // Thrift's default shutdown waits for the WorkerProcess threads to complete.  We do not,
        // because doing that allows a client to hold our shutdown "hostage" by simply not sending
        // another message after stop is called (since process will block indefinitely trying to read
        // the next meessage header).
        //
        // The "right" fix would be to update thrift to set a socket timeout on client connections
        // (and tolerate unintentional timeouts until stopped is set).  But this requires deep
        // changes to the code generator, so simply setting these threads to daemon (in our custom
        // CleaningThreadPool) and ignoring them after shutdown is good enough.
        //
        // Remember, our goal on shutdown is not necessarily that each client request we receive
        // gets answered first [to do that, you should redirect clients to a different coordinator
        // first], but rather (1) to make sure that for each update we ack as successful, we generate
        // hints for any non-responsive replicas, and (2) to make sure that we quickly stop
        // accepting client connections so shutdown can continue.  Not waiting for the WorkerProcess
        // threads here accomplishes (2); MessagingService's shutdown method takes care of (1).
        //
        // See CASSANDRA-3335 and CASSANDRA-3727.
    }

    public void stop()
    {
        stopped = true;
        serverTransport_.interrupt();
    }

    private class WorkerProcess implements Runnable
    {

        /**
         * Client that this services.
         */
        private TTransport client_;

        /**
         * Default constructor.
         *
         * @param client Transport to process
         */
        private WorkerProcess(TTransport client)
        {
            client_ = client;
        }

        /**
         * Loops on processing a client forever
         */
        public void run()
        {
            TProcessor processor = null;
            TTransport inputTransport = null;
            TTransport outputTransport = null;
            TProtocol inputProtocol = null;
            TProtocol outputProtocol = null;
            SocketAddress socket = null;
	    ThreadMXBean tm = ManagementFactory.getThreadMXBean();
	    logger.debug("CASSANDRA TEAM: Thread ID "  + Thread.currentThread().getId());
	    logger.debug("CPU time: " + tm.getThreadCpuTime(Thread.currentThread().getId()));
	    try 
	    {
		    logger.debug("Going to try Hello stuff");
		    Hello obj = new Hello();
		    logger.debug("Made the object, now going to initialize id");
		    int id=obj.returnThread();
		    logger.debug("Thread id is " + id);
		    if (CustomTThreadPoolServer.highPriority==false)
		    {
			    try
			    {
			    	    logger.debug("Sending to group1");
				    Runtime.getRuntime().exec("cgclassify -g cpu:/test_cpu/group1 "+id);
			    }
			    catch(Exception e)
			    {
				    logger.debug("not sent to cgroup",e);
				
			    }
		    }
		    else 
		    {
			    try
			    {
			    	    logger.debug("Sending to group2");
				    Runtime.getRuntime().exec("cgclassify -g cpu:/test_cpu/group2 "+id);
			    }
			    catch(Exception e)
			    {
				    logger.debug("not sent to cgroup",e);
			    }
		    }
	    }
	    catch (Exception e)
	    {
	    	logger.debug("Exception thrown at Hello ", e);
	    } 
            try
            {
                socket = ((TCustomSocket) client_).getSocket().getRemoteSocketAddress();
                ThriftSessionManager.instance.setCurrentSocket(socket);
                processor = processorFactory_.getProcessor(client_);
                inputTransport = inputTransportFactory_.getTransport(client_);
                outputTransport = outputTransportFactory_.getTransport(client_);
                inputProtocol = inputProtocolFactory_.getProtocol(inputTransport);
                outputProtocol = outputProtocolFactory_.getProtocol(outputTransport);
                // we check stopped first to make sure we're not supposed to be shutting
                // down. this is necessary for graceful shutdown.  (but not sufficient,
                // since process() can take arbitrarily long waiting for client input.
                // See comments at the end of serve().)
                while (!stopped && processor.process(inputProtocol, outputProtocol))
                {
                    inputProtocol = inputProtocolFactory_.getProtocol(inputTransport);
                    outputProtocol = outputProtocolFactory_.getProtocol(outputTransport);
                }
            }
            catch (TTransportException ttx)
            {
                // Assume the client died and continue silently
                // Log at debug to allow debugging of "frame too large" errors (see CASSANDRA-3142).
                logger.debug("Thrift transport error occurred during processing of message.", ttx);
            }
            catch (TException tx)
            {
                logger.error("Thrift error occurred during processing of message.", tx);
            }
            catch (Exception x)
            {
                logger.error("Error occurred during processing of message.", x);
            }
            finally
            {
                if (socket != null)
                    ThriftSessionManager.instance.connectionComplete(socket);
                if (inputTransport != null)
                    inputTransport.close();
                if (outputTransport != null)
                    outputTransport.close();
                activeClients.decrementAndGet();
            }
        }
    }

    public static class Factory implements TServerFactory
    {
        public TServer buildTServer(Args args)
        {
            final InetSocketAddress addr = args.addr;
            TServerTransport serverTransport;
            try
            {
                final ClientEncryptionOptions clientEnc = DatabaseDescriptor.getClientEncryptionOptions();
                if (clientEnc.enabled)
                {
                    logger.info("enabling encrypted thrift connections between client and server");
                    TSSLTransportParameters params = new TSSLTransportParameters(clientEnc.protocol, clientEnc.cipher_suites);
                    params.setKeyStore(clientEnc.keystore, clientEnc.keystore_password);
                    if (clientEnc.require_client_auth)
                    {
                        params.setTrustStore(clientEnc.truststore, clientEnc.truststore_password);
                        params.requireClientAuth(true);
                    }
                    TServerSocket sslServer = TSSLTransportFactory.getServerSocket(addr.getPort(), 0, addr.getAddress(), params);
                    SSLServerSocket sslServerSocket = (SSLServerSocket) sslServer.getServerSocket();
                    sslServerSocket.setEnabledProtocols(SSLFactory.ACCEPTED_PROTOCOLS);
                    serverTransport = new TCustomServerSocket(sslServer.getServerSocket(), args.keepAlive, args.sendBufferSize, args.recvBufferSize);
                }
                else
                {
                    serverTransport = new TCustomServerSocket(addr, args.keepAlive, args.sendBufferSize, args.recvBufferSize);
                }
            }
            catch (TTransportException e)
            {
                throw new RuntimeException(String.format("Unable to create thrift socket to %s:%s", addr.getAddress(), addr.getPort()), e);
            }
            // ThreadPool Server and will be invocation per connection basis...
            TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(serverTransport)
                                                                     .minWorkerThreads(DatabaseDescriptor.getRpcMinThreads())
                                                                     .maxWorkerThreads(DatabaseDescriptor.getRpcMaxThreads())
                                                                     .inputTransportFactory(args.inTransportFactory)
                                                                     .outputTransportFactory(args.outTransportFactory)
                                                                     .inputProtocolFactory(args.tProtocolFactory)
                                                                     .outputProtocolFactory(args.tProtocolFactory)
                                                                     .processor(args.processor);
            /*ExecutorService executorService = new ThreadPoolExecutor(serverArgs.minWorkerThreads,
                                                                     serverArgs.maxWorkerThreads,
                                                                     60,
                                                                     TimeUnit.SECONDS,
                                                                     new SynchronousQueue<Runnable>(),
                                                                     new NamedThreadFactory("Thrift"))*/
	    //CASSANDRA TEAM's modification 
            ExecutorService executorService = new ThreadPoolExecutor(serverArgs.minWorkerThreads,
                                                                     serverArgs.maxWorkerThreads,
                                                                     60,
                                                                     TimeUnit.SECONDS,
                                                                     new SynchronousQueue<Runnable>(),
                                                                     new NamedThreadFactory("Thrift"));
            return new CustomTThreadPoolServer(serverArgs, executorService);
        }
    }
}
