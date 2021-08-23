package com.stackoverflow.api;

/**
 * Calculate date/time difference in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5351516">https://stackoverflow.com/a/5351516</a>
 */
public class APIzator5351516 {

  public static long difference(int diff) throws Exception {
    long diffSeconds = diff / 1000 % 60;
    return diff / (60 * 1000) % 60;
  }
}
