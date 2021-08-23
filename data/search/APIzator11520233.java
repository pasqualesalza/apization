package com.stackoverflow.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Difference between shutdown and shutdownNow of Executor Service
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11520233">https://stackoverflow.com/a/11520233</a>
 */
public class APIzator11520233 {

  public static void difference() throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    executor.submit(
      new Runnable() {
        @Override
        public void run() {
          while (true) {
            if (Thread.currentThread().isInterrupted()) {
              System.out.println("interrupted");
              break;
            }
          }
        }
      }
    );
    executor.shutdown();
    if (!executor.awaitTermination(100, TimeUnit.MICROSECONDS)) {
      System.out.println(
        "Still waiting after 100ms: calling System.exit(0)..."
      );
      System.exit(0);
    }
    System.out.println("Exiting normally...");
  }
}
