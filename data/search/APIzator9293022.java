package com.stackoverflow.api;

/**
 * how to remove comma if string having comma at end
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9293022">https://stackoverflow.com/a/9293022</a>
 */
public class APIzator9293022 {

  public static void removeComma(String names) throws Exception {
    names = names.replaceAll(",$", "");
    if (names.endsWith(",")) {
      names = names.substring(0, names.length() - 1);
    }
  }
}
