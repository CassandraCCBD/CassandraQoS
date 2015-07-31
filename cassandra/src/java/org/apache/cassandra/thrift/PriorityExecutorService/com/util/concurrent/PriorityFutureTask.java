/**
 * Copyright 2013 Akshay Jain (akshay.jain.7983@gmail.com)
 *
 * This file is part of PriortyExecutorService.
 * 
 * PriortyExecutorService is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * PriortyExecutorService is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with PriortyExecutorService.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.util.concurrent;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PriorityFutureTask<T> extends FutureTask<T>
{
    private int priority;
    private static final Logger logger = LoggerFactory.getLogger(PriorityFutureTask.class);
    
    public PriorityFutureTask(Callable<T> callable, int priority) 
    {
        super(callable);
        this.validatePriority(priority);
        this.priority = priority;
    }

    public PriorityFutureTask(Runnable runnable, T result, int priority) 
    {
        super(runnable, result);
        this.validatePriority(priority);
        this.priority = priority;
    }
    
    public int getPriority()
    {
        return this.priority;
    }
    
    public void setPriority(int priority)
    {
        this.validatePriority(priority);
        this.priority = priority;
    }
    
    private void validatePriority(int priority)
    {
        if(priority<Thread.MIN_PRIORITY || priority>Thread.MAX_PRIORITY)
            throw new IllegalArgumentException("Priority should be between Thread.MIN_PRIORITY and Thread.MAX_PRIORITY");
    }
    
    @Override
    public void run()
    {
        int originalPriority = Thread.currentThread().getPriority();
	logger.debug("CASSANDRA TEAM: originalPriority is " + originalPriority + " setting it to " + priority);
        Thread.currentThread().setPriority(priority);
        super.run();
        Thread.currentThread().setPriority(originalPriority);
    }
    
    public String toString()
    {
        return "Priority: "+this.priority;
    }
}
