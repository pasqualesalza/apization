package com.stackoverflow.api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * How to use invokeAll() to let all thread pool do their task?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18203093">https://stackoverflow.com/a/18203093</a>
 */
public class APIzator18203093 {

  public static void useInvokeall() throws Exception {
    final ExecutorService executorService = Executors.newFixedThreadPool(10);
    final ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(
      executorService
    );
    executorService.submit(
      new Runnable() {
        @Override
        public void run() {
          for (int i = 0; i < 100; ++i) {
            try {
              final Future<String> myValue = completionService.take();
              // do stuff with the Future
              final String result = myValue.get();
              System.out.println(result);
            } catch (InterruptedException ex) {
              return;
            } catch (ExecutionException ex) {
              System.err.println("TASK FAILED");
            }
          }
        }
      }
    );
    for (int i = 0; i < 100; ++i) {
      completionService.submit(
        new Callable<String>() {
          @Override
          public String call() throws Exception {
            if (Math.random() > 0.5) {
              throw new RuntimeException("FAILED");
            }
            return "SUCCESS";
          }
        }
      );
    }
    executorService.shutdown();
  }
}
