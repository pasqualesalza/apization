package com.stackoverflow.api;

import java.math.BigInteger;

/**
 * How to convert a hexadecimal string to long in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5153956">https://stackoverflow.com/a/5153956</a>
 */
public class APIzator5153956 {

  public static BigInteger convertString(String s) throws Exception {
    BigInteger bi = new BigInteger(s, 16);
    return bi;
  }
}
