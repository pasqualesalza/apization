package com.stackoverflow.api;

/**
 * Why doesn't catching Exception catch RuntimeException?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19164070">https://stackoverflow.com/a/19164070</a>
 */
public class APIzator19164070 {

  public static void catch_() {
    try {
      throw new RuntimeException("Bang");
    } catch (Exception e) {
      System.out.println("I caught: " + e);
    }
  }
}
