package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map of maps - how to keep the inner maps as maps?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4120268">https://stackoverflow.com/a/4120268</a>
 */
public class APIzator4120268 {

  public static Map<String, Object> map(
    Map<Object, String> mp,
    Map<Object, String> mp2,
    Map<String, Object> mpMaps
  ) {
    for (int i = 0; i < mpMaps.size(); i++) {
      ArrayList<Object> a = new ArrayList<Object>(mpMaps.keySet());
      Object o = a.get(i);
      System.out.println(
        "all together: " +
        mpMaps.size() +
        "each element is:  " +
        o +
        " value: " +
        mpMaps.get(o)
      );
    }
    return mpMaps;
  }
}
