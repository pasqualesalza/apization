package com.stackoverflow.api;

/**
 * How to extract a string between two delimiters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13796501">https://stackoverflow.com/a/13796501</a>
 */
public class APIzator13796501 {

  public static String extractString(String str) throws Exception {
    return str.substring(str.indexOf("[") + 1, str.indexOf("]"));
  }
}
