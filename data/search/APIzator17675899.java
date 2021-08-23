package com.stackoverflow.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Remove multiple keys from Map in efficient way?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17675899">https://stackoverflow.com/a/17675899</a>
 */
public class APIzator17675899 {

  public static void removeKey(Map<String, String> map, Set<String> set)
    throws Exception {
    map.keySet().removeAll(set);
    // only contains "c"
    System.out.println(map);
  }
}
