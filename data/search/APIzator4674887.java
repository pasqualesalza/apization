package com.stackoverflow.api;

/**
 * Converting a sentence string to a string array of words in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4674887">https://stackoverflow.com/a/4674887</a>
 */
public class APIzator4674887 {

  public static void convertString(String s) throws Exception {
    String[] words = s.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      // You may want to check for a non-word character before blindly
      // performing a replacement
    }
  }
}
