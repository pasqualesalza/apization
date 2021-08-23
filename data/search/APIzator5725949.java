package com.stackoverflow.api;

/**
 * How to capitalize the first letter of word in a string using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5725949">https://stackoverflow.com/a/5725949</a>
 */
public class APIzator5725949 {

  public static String capitalizeLetter(String input) throws Exception {
    return input.substring(0, 1).toUpperCase() + input.substring(1);
  }
}
