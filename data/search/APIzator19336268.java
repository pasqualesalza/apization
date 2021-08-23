package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * How to create variables dynamically in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19336268">https://stackoverflow.com/a/19336268</a>
 */
public class APIzator19336268 {

  public static void createVariable() throws Exception {
    Map<String, String> details = new HashMap<>();
    for (int i = 1; i < 101; i++) {
      if (i < 60) {
        details.put("person" + i, "female");
      } else {
        details.put("person" + i, "male");
      }
    }
  }
}
