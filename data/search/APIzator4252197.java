package com.stackoverflow.api;

/**
 * How to stop execution after a certain time in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4252197">https://stackoverflow.com/a/4252197</a>
 */
public class APIzator4252197 {

  public static void stopExecution() throws Exception {
    long start = System.currentTimeMillis();
    // 60 seconds * 1000 ms/sec
    long end = start + 60 * 1000;
    while (System.currentTimeMillis() < end) {
      // run
    }
  }
}
