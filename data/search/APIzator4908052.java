package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort a two dimensional array based on one column
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4908052">https://stackoverflow.com/a/4908052</a>
 */
public class APIzator4908052 {

  public static void sortArray(String[][] data) {
    Arrays.sort(
      data,
      new Comparator<String[]>() {
        @Override
        public int compare(final String[] entry1, final String[] entry2) {
          final String time1 = entry1[0];
          final String time2 = entry2[0];
          return time1.compareTo(time2);
        }
      }
    );
    for (final String[] s : data) {
      System.out.println(s[0] + " " + s[1]);
    }
  }
}
