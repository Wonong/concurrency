package com.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface Concurrency {
	public void useSequential(List<MyTask> tasks);

	public void useParallelStream(List<MyTask> tasks);

	public void useParallelStreamWithExecutor(List<MyTask> tasks) throws ExecutionException, InterruptedException;

	public void useCompletableFuture(List<MyTask> tasks);

	public void useCompletableFutureWithExecutor(List<MyTask> tasks);
}
