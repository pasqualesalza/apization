package com.stackoverflow.api;

/**
 * How to replace from null value empty string in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16793361">https://stackoverflow.com/a/16793361</a>
 */
public class APIzator16793361 {

  public static String replace(String string) throws Exception {
    return ((string == null) ? "" : string);
  }
}
