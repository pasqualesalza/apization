package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java associative-array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5122948">https://stackoverflow.com/a/5122948</a>
 */
public class APIzator5122948 {

  public static void array(
    Map<String, String> map,
    List<Map<String, String>> data
  ) throws Exception {
    // etc
    // returns "demo"
    map.get("name");
    data.get(0).get("name");
  }
}
