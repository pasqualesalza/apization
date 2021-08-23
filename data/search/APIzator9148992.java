package com.stackoverflow.api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Returning value from Thread
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9148992">https://stackoverflow.com/a/9148992</a>
 */
public class APIzator9148992 {

  public static void test() throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Callable<Integer> callable = new Callable<Integer>() {
      @Override
      public Integer call() {
        return 2;
      }
    };
    Future<Integer> future = executor.submit(callable);
    // future.get() returns 2 or raises an exception if the thread dies, so safer
    executor.shutdown();
  }
}
