package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert Map<String,Object> to Map<String,String>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16807026">https://stackoverflow.com/a/16807026</a>
 */
public class APIzator16807026 {

  public static void map() throws Exception {
    // Object is containing String
    Map<String, Object> map = new HashMap<String, Object>();
    Map<String, String> newMap = new HashMap<String, String>();
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      if (entry.getValue() instanceof String) {
        newMap.put(entry.getKey(), (String) entry.getValue());
      }
    }
  }
}
