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

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class Executors
{
    public static PriorityExecutorService newPriorityFixedThreadPool(int nThreads)
    {
        return new PriorityThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS);
    }
    
    public static PriorityExecutorService newPriorityFixedThreadPool(int nThreads, ThreadFactory threadFactory)
    {
        return new PriorityThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, threadFactory);
    }
    
    public static PriorityExecutorService newPrioritySingleThreadPool()
    {
        return new PriorityThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS);
    }
    
    public static PriorityExecutorService newPrioritySingleThreadPool(ThreadFactory threadFactory)
    {
        return new PriorityThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, threadFactory);
    }
    
    public static PriorityExecutorService newPriorityCachedThreadPool()
    {
        return new PriorityThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS);
    }
    
    public static PriorityExecutorService newPriorityCachedThreadPool(ThreadFactory threadFactory)
    {
        return new PriorityThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, threadFactory);
    }
}
