package com.stackoverflow.api;

/**
 * How to find time taken to run java program?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6646535">https://stackoverflow.com/a/6646535</a>
 */
public class APIzator6646535 {

  public static long findTime() throws Exception {
    long startTime = System.nanoTime();
    // code
    long endTime = System.nanoTime();
    return (endTime - startTime);
  }
}
