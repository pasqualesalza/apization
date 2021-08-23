package com.stackoverflow.api;

/**
 * Find Positions of a Character in a String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19314980">https://stackoverflow.com/a/19314980</a>
 */
public class APIzator19314980 {

  public static void findPosition(String string) {
    for (int i = 0; i < string.length(); i++) if (
      string.charAt(i) == 'o'
    ) System.out.println(i);
  }
}
