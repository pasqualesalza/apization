package com.stackoverflow.api;

/**
 * Find occurrences of characters in a Java String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3764004">https://stackoverflow.com/a/3764004</a>
 */
public class APIzator3764004 {

  public static void findOccurrence(String string) throws Exception {
    int count = 0;
    for (int i = 0; i < string.length(); i++) if (
      string.charAt(i) == 'a'
    ) count++;
  }
}
