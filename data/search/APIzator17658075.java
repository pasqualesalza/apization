package com.stackoverflow.api;

/**
 * Creating multiplication table by looping in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17658075">https://stackoverflow.com/a/17658075</a>
 */
public class APIzator17658075 {

  public static void createTable() throws Exception {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i + "x" + j + "=" + (i * j) + "\t");
      }
      System.out.println();
    }
  }
}
