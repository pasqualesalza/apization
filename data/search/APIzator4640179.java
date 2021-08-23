package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Calculating all of the subsets of a set of numbers
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4640179">https://stackoverflow.com/a/4640179</a>
 */
public class APIzator4640179 {

  public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
    Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
    if (originalSet.isEmpty()) {
      sets.add(new HashSet<Integer>());
      return sets;
    }
    List<Integer> list = new ArrayList<Integer>(originalSet);
    Integer head = list.get(0);
    Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
    for (Set<Integer> set : powerSet(rest)) {
      Set<Integer> newSet = new HashSet<Integer>();
      newSet.add(head);
      newSet.addAll(set);
      sets.add(newSet);
      sets.add(set);
    }
    return sets;
  }
}
