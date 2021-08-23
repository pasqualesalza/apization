package com.stackoverflow.api;

import java.util.HashMap;

/**
 * Write a mode method in Java to find the most frequently occurring element in an array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/29373490">https://stackoverflow.com/a/29373490</a>
 */
public class APIzator29373490 {

  public static int mode(int[] array) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int max = 1;
    int temp = 0;
    for (int i = 0; i < array.length; i++) {
      if (hm.get(array[i]) != null) {
        int count = hm.get(array[i]);
        count++;
        hm.put(array[i], count);
        if (count > max) {
          max = count;
          temp = array[i];
        }
      } else hm.put(array[i], 1);
    }
    return temp;
  }
}
