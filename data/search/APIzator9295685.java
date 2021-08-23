package com.stackoverflow.api;

/**
 * String: How to replace multiple possible characters with a single character?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9295685">https://stackoverflow.com/a/9295685</a>
 */
public class APIzator9295685 {

  public static String string(String s) throws Exception {
    return s.toLowerCase().replaceAll("[ .]", "_");
  }
}
