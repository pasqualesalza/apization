package com.stackoverflow.api;

/**
 * How to convert nanoseconds to seconds using the TimeUnit enum?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/924220">https://stackoverflow.com/a/924220</a>
 */
public class APIzator924220 {

  public static double convertNanosecond(int end, int start)
    throws Exception {
    long elapsedTime = end - start;
    return (double) elapsedTime / 1000000000.0;
  }
}
