package com.stackoverflow.api;

/**
 * Insert a character in a string at a certain position
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5884396">https://stackoverflow.com/a/5884396</a>
 */
public class APIzator5884396 {

  public static void insertCharacter(int j) throws Exception {
    String x = Integer.toString(j);
    x = x.substring(0, 4) + "." + x.substring(4, x.length());
  }
}
