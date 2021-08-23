package com.stackoverflow.api;

/**
 * How to convert String to Hex and Hex to String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15020888">https://stackoverflow.com/a/15020888</a>
 */
public class APIzator15020888 {

  public static void convertString(int integer, String hexString)
    throws Exception {
    Integer.decode(hexString);
    Integer.toHexString(integer);
  }
}
