package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Split string into key-value pairs
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/31153944">https://stackoverflow.com/a/31153944</a>
 */
public class APIzator31153944 {

  public static void string(String test) throws Exception {
    Map<String, String> map = new HashMap<String, String>();
    // split on ':' and on '::'
    String[] parts = test.split("::?");
    for (int i = 0; i < parts.length; i += 2) {
      map.put(parts[i], parts[i + 1]);
    }
    for (String s : map.keySet()) {
      System.out.println(s + " is " + map.get(s));
    }
  }
}
