package com.stackoverflow.api;

/**
 * Left padding a String with Zeros
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4469748">https://stackoverflow.com/a/4469748</a>
 */
public class APIzator4469748 {

  public static void leave(String mystring) throws Exception {
    String.format("%010d", Integer.parseInt(mystring));
  }
}
