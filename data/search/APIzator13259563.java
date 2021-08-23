package com.stackoverflow.api;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * How to maintain a Unique List in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13259563">https://stackoverflow.com/a/13259563</a>
 */
public class APIzator13259563 {

  public static void maintainList(
    Set<Integer> linkedHashSet,
    Set<Integer> treeSet
  ) throws Exception {
    for (int i : linkedHashSet) {
      System.out.println(i);
    }
    for (int i : treeSet) {
      System.out.println(i);
    }
  }
}
