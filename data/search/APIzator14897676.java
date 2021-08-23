package com.stackoverflow.api;

/**
 * Comparing two integer arrays in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14897676">https://stackoverflow.com/a/14897676</a>
 */
public class APIzator14897676 {

  public static void compareArrays(int[] array1, int[] array2) {
    boolean b = true;
    if (array1 != null && array2 != null) {
      if (array1.length != array2.length) b = false; else for (
        int i = 0;
        i < array2.length;
        i++
      ) {
        if (array2[i] != array1[i]) {
          b = false;
        }
      }
    } else {
      b = false;
    }
    System.out.println(b);
  }
}
