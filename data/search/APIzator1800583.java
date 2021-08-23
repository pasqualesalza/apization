package com.stackoverflow.api;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Impossible to make a cached thread pool with a size limit?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1800583">https://stackoverflow.com/a/1800583</a>
 */
public class APIzator1800583 {

  public static void impossible() throws Exception {
    new ThreadPoolExecutor( // core size // core size
      10, // max size
      50, // idle timeout
      10 * 60,
      TimeUnit.SECONDS, // queue with a size
      new ArrayBlockingQueue<Runnable>(20)
    );
  }
}
