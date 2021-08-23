package com.stackoverflow.api;

/**
 * How to measure elapsed time
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15248918">https://stackoverflow.com/a/15248918</a>
 */
public class APIzator15248918 {

  public static double measureTime() throws Exception {
    long tStart = System.currentTimeMillis();
    long tEnd = System.currentTimeMillis();
    long tDelta = tEnd - tStart;
    return tDelta / 1000.0;
  }
}
