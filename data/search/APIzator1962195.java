package com.stackoverflow.api;

/**
 * How do I delete specific characters from a particular String in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1962195">https://stackoverflow.com/a/1962195</a>
 */
public class APIzator1962195 {

  public static void deleteCharacter(String str) throws Exception {
    str = str.replaceAll("[,.]", "");
  }
}
