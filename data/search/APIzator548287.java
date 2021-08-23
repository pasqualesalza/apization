package com.stackoverflow.api;

/**
 * Is there a good reason to use "printf" instead of "print" in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/548287">https://stackoverflow.com/a/548287</a>
 */
public class APIzator548287 {

  public static void be(int a, int b) throws Exception {
    // Tedious string concatenation.
    System.out.println("a: " + a + " b: " + b);
    // Output using string formatting.
    System.out.printf("a: %d b: %d\n", a, b);
  }
}
