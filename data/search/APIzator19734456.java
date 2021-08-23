package com.stackoverflow.api;

import java.math.BigInteger;

/**
 * How to find power of power of a number like 2^(10^9) in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19734456">https://stackoverflow.com/a/19734456</a>
 */
public class APIzator19734456 {

  public static BigInteger findPower() throws Exception {
    int exp = (int) Math.pow(10, 9);
    return BigInteger.valueOf(2).pow(exp);
  }
}
