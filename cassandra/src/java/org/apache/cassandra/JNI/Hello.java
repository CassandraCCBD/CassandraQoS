package org.apache.cassandra.Native;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
	private static final Logger logger = LoggerFactory.getLogger(Hello.class);
	public native int HelloWorld();
	static {
		System.loadLibrary("hello");
	}

	public int returnThread()
	{
		int id = HelloWorld();
		logger.debug("In returnThread of Hello");
		return id;
	}
}

