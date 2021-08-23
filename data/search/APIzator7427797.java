package com.stackoverflow.api;

import java.util.Map;
import java.util.TreeMap;

/**
 * How to use SortedMap interface in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7427797">https://stackoverflow.com/a/7427797</a>
 */
public class APIzator7427797 {

  public static void useInterface(Map<Integer, String> map)
    throws Exception {
    // Iterate over them
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }
  }
}
