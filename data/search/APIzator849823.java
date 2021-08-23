package com.stackoverflow.api;

import java.math.BigInteger;

/**
 * Large Numbers in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/849823">https://stackoverflow.com/a/849823</a>
 */
public class APIzator849823 {

  public static void number() throws Exception {
    BigInteger reallyBig = new BigInteger("1234567890123456890");
    BigInteger notSoBig = new BigInteger("2743561234");
    reallyBig = reallyBig.add(notSoBig);
  }
}
