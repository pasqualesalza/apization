package com.stackoverflow.api;

/**
 * Remove a specific word from a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10661497">https://stackoverflow.com/a/10661497</a>
 */
public class APIzator10661497 {

  public static void removeWord(String content, String regex)
    throws Exception {
    content = content.replaceAll(regex, "");
  }
}
