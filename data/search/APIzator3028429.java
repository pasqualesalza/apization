package com.stackoverflow.api;

import java.math.BigInteger;

/**
 * How to convert BigInteger to String in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3028429">https://stackoverflow.com/a/3028429</a>
 */
public class APIzator3028429 {

  public static String convertBiginteger(String msg) throws Exception {
    BigInteger bi = new BigInteger(msg.getBytes());
    return new String(bi.toByteArray());
  }
}
