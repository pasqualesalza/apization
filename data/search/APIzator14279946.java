package com.stackoverflow.api;

/**
 * What is inverse function to XOR?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14279946">https://stackoverflow.com/a/14279946</a>
 */
public class APIzator14279946 {

  public static void be(int c, int b, int a) throws Exception {
    c = a ^ b;
    // or b^c (order is not important)
    a = c ^ b;
    // or a^c
    b = c ^ a;
  }
}
