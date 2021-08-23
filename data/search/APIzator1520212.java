package com.stackoverflow.api;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Random shuffling of an array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1520212">https://stackoverflow.com/a/1520212</a>
 */
public class APIzator1520212 {

  public static void shuffling(int[] solutionArray) {
    shuffleArray(solutionArray);
    for (int i = 0; i < solutionArray.length; i++) {
      System.out.print(solutionArray[i] + " ");
    }
    System.out.println();
  }

  // Implementing Fisher–Yates shuffle
  static void shuffleArray(int[] ar) {
    // If running on Java 6 or older, use `new Random()` on RHS here
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--) {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}
