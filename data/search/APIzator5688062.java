package com.stackoverflow.api;

import java.nio.charset.StandardCharsets;

/**
 * How to convert a Java String to an ASCII byte array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5688062">https://stackoverflow.com/a/5688062</a>
 */
public class APIzator5688062 {

  public static byte[] convertString(String s) throws Exception {
    return s.getBytes(StandardCharsets.US_ASCII);
  }
}
