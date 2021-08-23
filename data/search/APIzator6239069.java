package com.stackoverflow.api;

/**
 * Regular Expression to remove everything but characters and numbers
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6239069">https://stackoverflow.com/a/6239069</a>
 */
public class APIzator6239069 {

  public static void expression(String string) throws Exception {
    string.replaceAll("[^a-zA-Z0-9]", "");
  }
}
