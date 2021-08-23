package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Random;

/**
 * Sort an array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8938308">https://stackoverflow.com/a/8938308</a>
 */
public class APIzator8938308 {

  public static void sortArray() throws Exception {
    int[] array = new int[10];
    Random rand = new Random();
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    // in reverse order
    for (int i = array.length - 1; i >= 0; i--) System.out.print(
      array[i] + " "
    );
    System.out.println();
  }
}
