package com.stackoverflow.api;

/**
 * In Java, how to find if first character in a string is upper case without regex
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4452968">https://stackoverflow.com/a/4452968</a>
 */
public class APIzator4452968 {

  public static void find(String s) throws Exception {
    Character.isUpperCase(s.codePointAt(0));
  }
}
