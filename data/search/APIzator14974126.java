package com.stackoverflow.api;

/**
 * Extract digits from string - StringUtils Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14974126">https://stackoverflow.com/a/14974126</a>
 */
public class APIzator14974126 {

  public static String extractDigits(String str) throws Exception {
    return str.replaceAll("[^0-9]", "");
  }
}
