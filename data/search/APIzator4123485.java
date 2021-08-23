package com.stackoverflow.api;

/**
 * Remove all empty lines
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4123485">https://stackoverflow.com/a/4123485</a>
 */
public class APIzator4123485 {

  public static void removeLine(String text) throws Exception {
    String adjusted = text.replaceAll("(?m)^[ \t]*\r?\n", "");
    // ...
  }
}
