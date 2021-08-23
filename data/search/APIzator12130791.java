package com.stackoverflow.api;

/**
 * Slice string in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12130791">https://stackoverflow.com/a/12130791</a>
 */
public class APIzator12130791 {

  public static String string(String s) throws Exception {
    // returns an array with the 2 parts
    String[] parts = s.split("_");
    return parts[0];
  }
}
