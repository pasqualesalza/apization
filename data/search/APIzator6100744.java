package com.stackoverflow.api;

/**
 * Simple way to count character occurrences in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6100744">https://stackoverflow.com/a/6100744</a>
 */
public class APIzator6100744 {

  public static void way(String s) throws Exception {
    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '$') {
        counter++;
      }
    }
  }
}
