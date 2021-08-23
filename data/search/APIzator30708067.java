package com.stackoverflow.api;

/**
 * Delete the last two characters of the String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30708067">https://stackoverflow.com/a/30708067</a>
 */
public class APIzator30708067 {

  public static String deleteCharacter(String s) {
    return s.substring(0, s.length() - 2);
  }
}
