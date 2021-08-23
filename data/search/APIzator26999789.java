package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap initialization in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/26999789">https://stackoverflow.com/a/26999789</a>
 */
public class APIzator26999789 {

  public static <K, V> Map<K, V> mapFromArrays(K[] keys, V[] values) {
    HashMap<K, V> result = new HashMap<K, V>();
    for (int i = 0; i < keys.length; i++) {
      result.put(keys[i], values[i]);
    }
    return result;
  }

  private static Integer[] keys = new Integer[] { 1, 2, 3 };

  private static String[] values = new String[] { "first", "second", "third" };

  private static Map<Integer, String> myMap;

  {
    myMap = mapFromArrays(keys, values);
  }
}
