package com.stackoverflow.api;

/**
 * Correct use Java "assert" keyword
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18907517">https://stackoverflow.com/a/18907517</a>
 */
public class APIzator18907517 {

  public static void useAssert(int mode) throws Exception {
    switch (mode) {
      case 0:
        // do stuff
        break;
      case 1:
        // do other stuff
        break;
      default:
        throw new IllegalArgumentException("Mode is illegal");
    }
  }
}
