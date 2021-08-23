package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * String to HashMap JAVA
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10514517">https://stackoverflow.com/a/10514517</a>
 */
public class APIzator10514517 {

  public static void string(String s) throws Exception {
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    String[] pairs = s.split(",");
    for (int i = 0; i < pairs.length; i++) {
      String pair = pairs[i];
      String[] keyValue = pair.split(":");
      myMap.put(keyValue[0], Integer.valueOf(keyValue[1]));
    }
  }
}
