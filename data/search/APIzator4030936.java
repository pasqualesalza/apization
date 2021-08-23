package com.stackoverflow.api;

/**
 * Extract digits from a string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4030936">https://stackoverflow.com/a/4030936</a>
 */
public class APIzator4030936 {

  public static void extractDigits(String str) throws Exception {
    str = str.replaceAll("\\D+", "");
  }
}
