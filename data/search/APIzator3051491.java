package com.stackoverflow.api;

import java.util.HashMap;

/**
 * Search a value for a given key in a HashMap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3051491">https://stackoverflow.com/a/3051491</a>
 */
public class APIzator3051491 {

  public static String searchValue(HashMap<String, String> map)
    throws Exception {
    return map.get("x");
  }
}
