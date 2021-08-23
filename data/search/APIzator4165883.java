package com.stackoverflow.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting Values of Set
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4165883">https://stackoverflow.com/a/4165883</a>
 */
public class APIzator4165883 {

  public static void sortValue(List list) throws Exception {
    Collections.sort(
      list,
      new Comparator<String>() {
        public int compare(String o1, String o2) {
          Integer i1 = Integer.parseInt(o1);
          Integer i2 = Integer.parseInt(o2);
          return (i1 > i2 ? -1 : (i1 == i2 ? 0 : 1));
        }
      }
    );
  }
}
