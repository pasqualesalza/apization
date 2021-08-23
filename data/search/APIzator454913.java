package com.stackoverflow.api;

/**
 * Split Java String by New Line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/454913">https://stackoverflow.com/a/454913</a>
 */
public class APIzator454913 {

  public static String[] string(String string) throws Exception {
    return string.split("\\r?\\n");
  }
}
