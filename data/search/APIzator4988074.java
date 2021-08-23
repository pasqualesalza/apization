package com.stackoverflow.api;

/**
 * Java indexOf method for multiple matches in String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4988074">https://stackoverflow.com/a/4988074</a>
 */
public class APIzator4988074 {

  public static void method(String str) throws Exception {
    int i = 0;
    i = str.indexOf('x');
    while (i >= 0) {
      System.out.println(i);
      i = str.indexOf('x', i + 1);
    }
  }
}
