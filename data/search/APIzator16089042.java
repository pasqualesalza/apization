package com.stackoverflow.api;

/**
 * Sorting an Array of int using BubbleSort
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16089042">https://stackoverflow.com/a/16089042</a>
 */
public class APIzator16089042 {

  public static void bubbleSort(int[] numArray) {
    int n = numArray.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (numArray[j - 1] > numArray[j]) {
          temp = numArray[j - 1];
          numArray[j - 1] = numArray[j];
          numArray[j] = temp;
        }
      }
    }
  }
}
