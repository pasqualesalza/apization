package com.stackoverflow.api;

/**
 * Single quotes replace in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3156300">https://stackoverflow.com/a/3156300</a>
 */
public class APIzator3156300 {

  public static void replace(String s) throws Exception {
    s = s.replace("'", "\\'");
    System.out.println(s);
    // Hello \'thanks\' bye
  }
}
