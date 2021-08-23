package com.stackoverflow.api;

/**
 * Creating a triangle with for loops
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11409778">https://stackoverflow.com/a/11409778</a>
 */
public class APIzator11409778 {

  public static void createTriangle() throws Exception {
    for (int i = 1; i < 10; i += 2) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for (int i = 1; i < 10; i += 2) {
      for (int k = 0; k < (4 - i / 2); k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
