package com.stackoverflow.api;

/**
 * Get unicode value of a character
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2220476">https://stackoverflow.com/a/2220476</a>
 */
public class APIzator2220476 {

  public static String getValue() throws Exception {
    return Integer.toHexString('÷' | 0x10000).substring(1);
  }
}
