package com.stackoverflow.api;

/**
 * Explanation of "ClassCastException" in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/907367">https://stackoverflow.com/a/907367</a>
 */
public class APIzator907367 {

  public static String explanation() throws Exception {
    Object i = Integer.valueOf(42);
    return (String) i;
  }
}
