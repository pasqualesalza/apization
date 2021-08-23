package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Merging two Maps
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8796008">https://stackoverflow.com/a/8796008</a>
 */
public class APIzator8796008 {

  public static void mergeMap() throws Exception {
    Map<String, Set<Double>> firstMap = new HashMap<String, Set<Double>>();
    Map<String, Set<Double>> secondMap = new HashMap<String, Set<Double>>();
    Set<Map.Entry<String, Set<Double>>> entries = firstMap.entrySet();
    for (Map.Entry<String, Set<Double>> entry : entries) {
      Set<Double> secondMapValue = secondMap.get(entry.getKey());
      if (secondMapValue == null) {
        secondMap.put(entry.getKey(), entry.getValue());
      } else {
        secondMapValue.addAll(entry.getValue());
      }
    }
  }
}
