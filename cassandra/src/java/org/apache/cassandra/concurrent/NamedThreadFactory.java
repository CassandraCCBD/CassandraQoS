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
package org.apache.cassandra.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is an implementation of the <i>ThreadFactory</i> interface. This
 * is useful to give Java threads meaningful names which is useful when using
 * a tool like JConsole.
 */

public class NamedThreadFactory implements ThreadFactory
{
    private static final Logger logger = LoggerFactory.getLogger(NamedThreadFactory.class);
    protected final String id;
    private final int priority;
    protected final AtomicInteger n = new AtomicInteger(1);

    public NamedThreadFactory(String id)
    {
        this(id, Thread.NORM_PRIORITY);
    }

    public NamedThreadFactory(String id, int priority)
    {
	logger.debug("CASSANDRA TEAM: Id is " + id + " n is " + n + " priority is " + priority);
	if (id.equals("Thrift"))
	{
		try 
		{
			throw new RuntimeException("Throwing exception for stacktrace of Thrift Thread");
		}
		catch (Exception e)
		{
			logger.debug("CASSANDRA TEAM: Stacktrace ", e);
		}
	}
        this.id = id;
        this.priority = priority;
    }

    public Thread newThread(Runnable runnable)
    {
        String name = id + ":" + n.getAndIncrement();
	logger.debug("CASSANDRA TEAM: Id is " + id + " n is " + n + " priority is " + priority);
	if (id.equals("Thrift"))
	{
		try 
		{
			throw new RuntimeException("Throwing exception for stacktrace of Thrift Thread");
		}
		catch (Exception e)
		{
			logger.debug("CASSANDRA TEAM: Stacktrace ", e);
		}
	}
        Thread thread = new Thread(runnable, name);
        thread.setPriority(priority);
        thread.setDaemon(true);
        return thread;
    }
}
