package com.stackoverflow.api;

import java.util.HashSet;
import java.util.Set;

/**
 * Cartesian product of arbitrary sets in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/714256">https://stackoverflow.com/a/714256</a>
 */
public class APIzator714256 {

  public static Set<Set<Object>> cartesianProduct(Set<?>... sets) {
    if (sets.length < 2) throw new IllegalArgumentException(
      "Can't have a product of fewer than two sets (got " + sets.length + ")"
    );
    return _cartesianProduct(0, sets);
  }

  private static Set<Set<Object>> _cartesianProduct(int index, Set<?>... sets) {
    Set<Set<Object>> ret = new HashSet<Set<Object>>();
    if (index == sets.length) {
      ret.add(new HashSet<Object>());
    } else {
      for (Object obj : sets[index]) {
        for (Set<Object> set : _cartesianProduct(index + 1, sets)) {
          set.add(obj);
          ret.add(set);
        }
      }
    }
    return ret;
  }
}
