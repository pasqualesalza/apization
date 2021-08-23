package com.stackoverflow.api;

/**
 * Regex to check string contains only Hex characters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5317339">https://stackoverflow.com/a/5317339</a>
 */
public class APIzator5317339 {

  public static boolean containCharacter(String s) throws Exception {
    return s.matches("[0-9A-F]+");
  }
}
