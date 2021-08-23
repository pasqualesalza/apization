package com.stackoverflow.api;

/**
 * java codility Frog-River-One
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19460553">https://stackoverflow.com/a/19460553</a>
 */
public class APIzator19460553 {

  public static int frog(int X, int[] A) {
    int steps = X;
    boolean[] bitmap = new boolean[steps + 1];
    for (int i = 0; i < A.length; i++) {
      if (!bitmap[A[i]]) {
        bitmap[A[i]] = true;
        steps--;
      }
      if (steps == 0) return i;
    }
    return -1;
  }
}
