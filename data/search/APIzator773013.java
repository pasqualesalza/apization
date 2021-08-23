package com.stackoverflow.api;

/**
 * Inserting a Java string in another string without concatenation?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/773013">https://stackoverflow.com/a/773013</a>
 */
public class APIzator773013 {

  public static String insertString() throws Exception {
    return String.format("test goes here %s more text", "Testing");
  }
}
