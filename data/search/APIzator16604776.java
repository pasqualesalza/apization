package com.stackoverflow.api;

/**
 * Ignore case for 'contains' for a string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16604776">https://stackoverflow.com/a/16604776</a>
 */
public class APIzator16604776 {

  public static void case_(String s) throws Exception {
    s.toLowerCase().contains("ABCD".toLowerCase());
  }
}
