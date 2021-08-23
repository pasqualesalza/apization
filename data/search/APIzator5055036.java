package com.stackoverflow.api;

/**
 * How to replace case-insensitive literal substrings in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5055036">https://stackoverflow.com/a/5055036</a>
 */
public class APIzator5055036 {

  public static String replaceSubstring(String target) throws Exception {
    target = target.replaceAll("(?i)foo", "");
    return target;
  }
}
