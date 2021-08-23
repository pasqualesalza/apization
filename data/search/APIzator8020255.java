package com.stackoverflow.api;

/**
 * Is it ok if I omit curly braces in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8020255">https://stackoverflow.com/a/8020255</a>
 */
public class APIzator8020255 {

  public static void be(int size, int b) throws Exception {
    int a = 0;
    for (int i = 0; i < size; i++) a += b;
    System.out.println("foo");
    for (int i = 0; i < size; i++) a += b;
    System.out.println("foo");
    for (int i = 0; i < size; i++) {
      a += b;
      System.out.println("foo");
    }
  }
}
