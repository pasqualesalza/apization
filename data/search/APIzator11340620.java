package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Converting string array to hashmap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11340620">https://stackoverflow.com/a/11340620</a>
 */
public class APIzator11340620 {

  public static void convertArray(String input) throws Exception {
    final String[] fields = input.split("\\|");
    final Map<String, String> m = new HashMap<String, String>();
    int i = 0;
    for (String key : new String[] { "id", "cid", "refno" }) m.put(
      key,
      fields[i++]
    );
  }
}
