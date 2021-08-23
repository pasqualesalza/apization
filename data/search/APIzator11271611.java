package com.stackoverflow.api;

/**
 * Compare two strings in Java with possible null values
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11271611">https://stackoverflow.com/a/11271611</a>
 */
public class APIzator11271611 {

  public static boolean compare(String str1, String str2) {
    return (str1 == null ? str2 == null : str1.equals(str2));
  }
}
