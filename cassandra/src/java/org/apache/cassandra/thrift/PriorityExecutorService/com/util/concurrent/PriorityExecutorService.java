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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface PriorityExecutorService extends ExecutorService
{
    public Future<?> submit(Runnable task, int priority);
    public <T> Future<T> submit(Runnable task, T result, int priority);
    public <T> Future<T> submit(Callable<T> task, int priority);
    public int getLeastPriority();
    public int getHighestPriority();
    public <T> void changePriorities(int fromPriority, int toPriority);
}
