package com.stackoverflow.api;

/**
 * Convert a RGB Color Value to a Hexadecimal
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3607942">https://stackoverflow.com/a/3607942</a>
 */
public class APIzator3607942 {

  public static String convertValue(int g, int b, int r)
    throws Exception {
    return String.format("#%02x%02x%02x", r, g, b);
  }
}
