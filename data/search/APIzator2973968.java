package com.stackoverflow.api;

import java.util.*;

/**
 * How to Maintain order of insertion using collections
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2973968">https://stackoverflow.com/a/2973968</a>
 */
public class APIzator2973968 {

  public static void maintainOrder() {
    populateThenDump(new HashMap<String, Integer>());
    populateThenDump(new TreeMap<String, Integer>());
    populateThenDump(new LinkedHashMap<String, Integer>());
  }

  static void populateThenDump(Map<String, Integer> map) {
    System.out.println(map.getClass().getName());
    map.put("Zero", 0);
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }
  }
}
