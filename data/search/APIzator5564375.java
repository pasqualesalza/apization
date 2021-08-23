package com.stackoverflow.api;

/**
 * Find count of digits in string variable
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5564375">https://stackoverflow.com/a/5564375</a>
 */
public class APIzator5564375 {

  public static void findCount(String s) throws Exception {
    int count = 0;
    for (int i = 0, len = s.length(); i < len; i++) {
      if (Character.isDigit(s.charAt(i))) {
        count++;
      }
    }
  }
}
