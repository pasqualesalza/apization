package com.stackoverflow.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * How can I sort this ArrayList the way that I want?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/890470">https://stackoverflow.com/a/890470</a>
 */
public class APIzator890470 {

  public static void sortArraylist(List list) throws Exception {
    Collections.sort(
      list,
      new Comparator<String>() {
        public int compare(String a, String b) {
          return Integer.signum(fixString(a) - fixString(b));
        }

        private int fixString(String in) {
          return Integer.parseInt(in.substring(0, in.indexOf('_')));
        }
      }
    );
  }
}
