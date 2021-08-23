package com.stackoverflow.api;

/**
 * Split string with | separator in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6305687">https://stackoverflow.com/a/6305687</a>
 */
public class APIzator6305687 {

  public static String[] string(String line) throws Exception {
    return line.split("\\|");
  }
}
