package com.stackoverflow.api;

/**
 * Nested functions in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/28576581">https://stackoverflow.com/a/28576581</a>
 */
public class APIzator28576581 {

  public static void function() throws Exception {
    java.util.function.BiConsumer<Integer, Integer> times = (i, num) -> {
      i *= num;
      System.out.println(i);
    };
    for (int i = 1; i < 100; i++) {
      // multiply i by 2 and print i
      times.accept(i, 2);
      // square i and then print the result
      times.accept(i, i);
    }
  }
}
