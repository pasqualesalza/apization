package com.stackoverflow.api;

import java.math.BigInteger;

/**
 * In Java, how do I convert a hex string to a byte[]?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8890335">https://stackoverflow.com/a/8890335</a>
 */
public class APIzator8890335 {

  public static byte[] convertString(String s) throws Exception {
    return new BigInteger(s, 16).toByteArray();
  }
}
