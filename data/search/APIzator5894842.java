package com.stackoverflow.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * How to sort ArrayList<Long> in Java in decreasing order?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5894842">https://stackoverflow.com/a/5894842</a>
 */
public class APIzator5894842 {

  public static void sortArraylist(List list) throws Exception {
    Collections.sort(list);
    Collections.reverse(list);
    Collections.sort(
      list,
      new Comparator<Long>() {
        public int compare(Long o1, Long o2) {
          return o2.compareTo(o1);
        }
      }
    );
    Collections.sort(list, Collections.reverseOrder());
  }
}
