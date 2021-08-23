package com.stackoverflow.api;

/**
 * Difference between e.printStackTrace and System.out.println(e)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12095452">https://stackoverflow.com/a/12095452</a>
 */
public class APIzator12095452 {

  public static void difference() {
    try {
      test();
    } catch (UnsupportedOperationException e) {
      System.out.println(e);
      e.printStackTrace();
    }
  }

  private static void test() {
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
