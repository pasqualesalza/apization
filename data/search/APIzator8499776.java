package com.stackoverflow.api;

/**
 * Trim a string based on the string length
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8499776">https://stackoverflow.com/a/8499776</a>
 */
public class APIzator8499776 {

  public static void trimString(String s) throws Exception {
    s = s.substring(0, Math.min(s.length(), 10));
  }
}
