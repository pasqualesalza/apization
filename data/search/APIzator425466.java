package com.stackoverflow.api;

/**
 * How to check if array element is null to avoid NullPointerException in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/425466">https://stackoverflow.com/a/425466</a>
 */
public class APIzator425466 {

  public static void check(Object[][] someArray) {
    for (int i = 0; i <= someArray.length - 1; i++) {
      if (someArray[i] != null) {
        System.out.println("not null");
      } else {
        System.out.println("null");
      }
    }
  }
}
