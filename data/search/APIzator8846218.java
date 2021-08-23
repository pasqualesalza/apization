package com.stackoverflow.api;

/**
 * How to remove first and last character of a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8846218">https://stackoverflow.com/a/8846218</a>
 */
public class APIzator8846218 {

  public static String removeCharacter(String loginToken)
    throws Exception {
    return loginToken.substring(1, loginToken.length() - 1);
  }
}
