package com.stackoverflow.api;

/**
 * Shortcut "or-assignment" (|=) operator in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2486574">https://stackoverflow.com/a/2486574</a>
 */
public class APIzator2486574 {

  public static void shortcut(int b1, int b2) throws Exception {
    b1 |= b2;
    b1 = b1 | b2;
  }
}
