package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How to remove common values from two array list
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15575578">https://stackoverflow.com/a/15575578</a>
 */
public class APIzator15575578 {

  public static void removeValue() throws Exception {
    // Make the two lists
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(2, 3, 4, 6, 7);
    // Prepare a union
    List<Integer> union = new ArrayList<Integer>(list1);
    union.addAll(list2);
    // Prepare an intersection
    List<Integer> intersection = new ArrayList<Integer>(list1);
    intersection.retainAll(list2);
    // Subtract the intersection from the union
    union.removeAll(intersection);
    // Print the result
    for (Integer n : union) {
      System.out.println(n);
    }
  }
}
