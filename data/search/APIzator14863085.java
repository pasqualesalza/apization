package com.stackoverflow.api;

/**
 * Java string null check by != null or !str.equals(null)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14863085">https://stackoverflow.com/a/14863085</a>
 */
public class APIzator14863085 {

  public static void check(String str) throws Exception {
    // will throw `NPE`.
    str.equals(null);
  }
}
