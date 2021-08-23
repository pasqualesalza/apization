package com.stackoverflow.api;

/**
 * Splitting a string at every n-th character
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2297450">https://stackoverflow.com/a/2297450</a>
 */
public class APIzator2297450 {

  public static String splitString(String s) throws Exception {
    return java.util.Arrays.toString(s.split("(?<=\\G...)"));
  }
}
