package com.stackoverflow.api;

/**
 * Simple java program of pyramid
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21373831">https://stackoverflow.com/a/21373831</a>
 */
public class APIzator21373831 {

  public static void program() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("$ ");
      }
      System.out.println();
    }
  }
}
