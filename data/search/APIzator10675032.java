package com.stackoverflow.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * java sort using anonymous class
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10675032">https://stackoverflow.com/a/10675032</a>
 */
public class APIzator10675032 {

  public static void useClass(List ls) throws Exception {
    Collections.sort(
      ls,
      new Comparator() {
        public int compare(Object o1, Object o2) {
          String sa = (String) o1;
          String sb = (String) o2;
          int v = sa.compareTo(sb);
          return v;
          // it can also return 0, and 1
        }
      }
    );
  }
}
