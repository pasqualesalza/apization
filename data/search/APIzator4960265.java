package com.stackoverflow.api;

/**
 * Char into byte? (Java)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4960265">https://stackoverflow.com/a/4960265</a>
 */
public class APIzator4960265 {

  public static int char_(char a) throws Exception {
    // b = 0xFF
    byte b = (byte) a;
    // c = 0xFFFF
    char c = (char) b;
    return (int) c;
  }
}
