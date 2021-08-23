package com.stackoverflow.api;

/**
 * Checking for Alphabets in a String in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15562331">https://stackoverflow.com/a/15562331</a>
 */
public class APIzator15562331 {

  public static void check(String s) throws Exception {
    for (int i = 0; i < s.length(); i++) {
      char charAt2 = s.charAt(i);
      if (Character.isLetter(charAt2)) {
        System.out.println(charAt2 + "is a alphabet");
      }
    }
  }
}
