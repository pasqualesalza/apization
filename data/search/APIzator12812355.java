package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How to remove specific value from string array in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12812355">https://stackoverflow.com/a/12812355</a>
 */
public class APIzator12812355 {

  public static void removeValue(String[] str_array) throws Exception {
    List<String> list = new ArrayList<String>(Arrays.asList(str_array));
    list.remove("item2");
    str_array = list.toArray(new String[0]);
  }
}
