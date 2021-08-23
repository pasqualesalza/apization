package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Remove duplicates from ArrayLists
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5741080">https://stackoverflow.com/a/5741080</a>
 */
public class APIzator5741080 {

  public static void removeDuplicates(List<Object> l) {
    // ... the list is already populated
    Set<Object> s = new TreeSet<Object>(
      new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
          // ... compare the two object according to your requirements
          return 0;
        }
      }
    );
    s.addAll(l);
    List<Object> res = Arrays.asList(s.toArray());
  }
}
