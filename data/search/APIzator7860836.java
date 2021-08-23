package com.stackoverflow.api;

import java.util.Map;
import java.util.Map;
import java.util.TreeMap;

/**
 * Sorting hashmap based on keys
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7860836">https://stackoverflow.com/a/7860836</a>
 */
public class APIzator7860836 {

  public static Map<String, Float> sortHashmap(Map yourMap)
    throws Exception {
    return new TreeMap<>(yourMap);
  }
}
