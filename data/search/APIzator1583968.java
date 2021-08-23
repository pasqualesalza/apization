package com.stackoverflow.api;

/**
 * How do I get the first n characters of a string without checking the size or going out of bounds?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1583968">https://stackoverflow.com/a/1583968</a>
 */
public class APIzator1583968 {

  public static String getCharacter(int n, String s) throws Exception {
    return s.substring(0, Math.min(s.length(), n));
  }
}
