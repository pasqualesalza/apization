package com.stackoverflow.api;

/**
 * Getting a substring from a string after a particular word
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25225482">https://stackoverflow.com/a/25225482</a>
 */
public class APIzator25225482 {

  public static void getSubstring(String yourString) throws Exception {
    yourString.substring(yourString.indexOf("no") + 3, yourString.length());
  }
}
