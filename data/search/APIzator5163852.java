package com.stackoverflow.api;

/**
 * How do I get the last character of a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5163852">https://stackoverflow.com/a/5163852</a>
 */
public class APIzator5163852 {

  public static String getCharacter(String str1) {
    String string = str1;
    return string.substring(string.length() - 1);
  }
}
