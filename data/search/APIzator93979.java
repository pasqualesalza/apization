package com.stackoverflow.api;

/**
 * How to determine whether a character is a letter in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/93979">https://stackoverflow.com/a/93979</a>
 */
public class APIzator93979 {

  public static void determine(String string, int character)
    throws Exception {
    // Unicode letter
    string.matches("\\p{L}");
    // Unicode upper-case letter
    string.matches("\\p{Lu}");
    Character.isLetter(character);
  }
}
