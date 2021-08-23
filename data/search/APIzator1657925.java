package com.stackoverflow.api;

/**
 * How should I throw a divide by zero exception in Java without actually dividing by zero?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1657925">https://stackoverflow.com/a/1657925</a>
 */
public class APIzator1657925 {

  public static void throwDivide(int divisor) throws Exception {
    if (divisor == 0) {
      throw new IllegalArgumentException("Argument 'divisor' is 0");
    }
  }
}
