package com.stackoverflow.api;

/**
 * How to test if a double is an integer
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9898528">https://stackoverflow.com/a/9898528</a>
 */
public class APIzator9898528 {

  public static void test(int variable) throws Exception {
    if ((variable == Math.floor(variable)) && !Double.isInfinite(variable)) {
      // integer type
    }
  }
}
