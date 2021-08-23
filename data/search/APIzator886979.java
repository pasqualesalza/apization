package com.stackoverflow.api;

/**
 * Breaking out of nested loops in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/886979">https://stackoverflow.com/a/886979</a>
 */
public class APIzator886979 {

  public static void break_() {
    outerloop:for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (i * j > 6) {
          System.out.println("Breaking");
          break outerloop;
        }
        System.out.println(i + " " + j);
      }
    }
    System.out.println("Done");
  }
}
