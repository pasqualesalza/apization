package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * How do I dynamically name objects in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2711078">https://stackoverflow.com/a/2711078</a>
 */
public class APIzator2711078 {

  public static void nameObject() throws Exception {
    List<String[]> kList = new ArrayList<String[]>();
    for (int k = 0; k < 5; k++) {
      kList.add(new String[3]);
    }
    Map<Integer, String[]> kMap = new HashMap<Integer, String[]>();
    for (int k = 0; k < 5; k++) {
      kMap.put(k, new String[3]);
    }
    // access using kMap.get(0) etc..
  }
}
