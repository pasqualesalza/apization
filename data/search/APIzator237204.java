package com.stackoverflow.api;

/**
 * What's the best way to check if a String represents an integer in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/237204">https://stackoverflow.com/a/237204</a>
 */
public class APIzator237204 {

  public static boolean isInteger(String str) {
    int length = 0;
    if (str == null) {
      return false;
    }
    if (str.isEmpty()) {
      return false;
    }
    int i = 0;
    if (str.charAt(0) == '-') {
      if (length == 1) {
        return false;
      }
      i = 1;
    }
    for (; i < length; i++) {
      char c = str.charAt(i);
      if (c < '0' || c > '9') {
        return false;
      }
    }
    return true;
  }
}
