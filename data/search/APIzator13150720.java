package com.stackoverflow.api;

/**
 * Convert Character array to string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13150720">https://stackoverflow.com/a/13150720</a>
 */
public class APIzator13150720 {

  public static String array(Character[] chars, String str)
    throws Exception {
    for (Character c : chars) str += c.toString();
    return str;
  }
}
