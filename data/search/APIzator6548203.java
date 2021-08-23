package com.stackoverflow.api;

/**
 * How to catch an Exception from a thread
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6548203">https://stackoverflow.com/a/6548203</a>
 */
public class APIzator6548203 {

  public static void catchException() throws Exception {
    Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
      public void uncaughtException(Thread th, Throwable ex) {
        System.out.println("Uncaught exception: " + ex);
      }
    };
    Thread t = new Thread() {
      public void run() {
        System.out.println("Sleeping ...");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println("Interrupted.");
        }
        System.out.println("Throwing exception ...");
        throw new RuntimeException();
      }
    };
    t.setUncaughtExceptionHandler(h);
    t.start();
  }
}
