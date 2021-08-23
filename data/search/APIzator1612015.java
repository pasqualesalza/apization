package com.stackoverflow.api;

/**
 * Remove all non-"word characters" from a String in Java, leaving accented characters?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1612015">https://stackoverflow.com/a/1612015</a>
 */
public class APIzator1612015 {

  public static String removeCharacter(String subjectString)
    throws Exception {
    return subjectString.replaceAll("[^\\p{L}\\p{Nd}]+", "");
  }
}
