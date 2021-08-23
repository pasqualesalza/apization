package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Comparator;

/**
 * int[] array (sort lowest to highest)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9791300">https://stackoverflow.com/a/9791300</a>
 */
public class APIzator9791300 {

  public static Integer[] array(Integer[] arr) throws Exception {
    Arrays.sort(
      arr,
      new Comparator<Integer>() {
        @Override
        public int compare(Integer x, Integer y) {
          return x - y;
        }
      }
    );
    return arr;
  }
}
