package com.stackoverflow.api;

/**
 * Sprintf equivalent in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/47049">https://stackoverflow.com/a/47049</a>
 */
public class APIzator47049 {

  public static String equivalent(int j, int i) throws Exception {
    // Store the formatted string in 'result'
    String result = String.format("%4d", i * j);
    return result;
  }
}
