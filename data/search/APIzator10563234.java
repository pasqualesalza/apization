package com.stackoverflow.api;

/**
 * Java split a string by space, new line, tab, punctuation
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10563234">https://stackoverflow.com/a/10563234</a>
 */
public class APIzator10563234 {

  public static String[] splitString(String message) throws Exception {
    return message.split("\\W+");
  }
}
