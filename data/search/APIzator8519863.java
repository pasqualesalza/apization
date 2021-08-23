package com.stackoverflow.api;

/**
 * Replace non ASCII character from string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8519863">https://stackoverflow.com/a/8519863</a>
 */
public class APIzator8519863 {

  public static String replaceCharacter(String subjectString)
    throws Exception {
    return subjectString.replaceAll("[^\\x00-\\x7F]", "");
  }
}
