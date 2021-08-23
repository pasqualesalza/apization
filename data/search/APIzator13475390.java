package com.stackoverflow.api;

/**
 * Generate fixed length Strings filled with whitespaces
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13475390">https://stackoverflow.com/a/13475390</a>
 */
public class APIzator13475390 {

  public static String fixedLengthString(String string, int length) {
    return String.format("%1$" + length + "s", string);
  }
}
