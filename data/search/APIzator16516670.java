package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * How can I store HashMap<String, ArrayList<String>> inside a list?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16516670">https://stackoverflow.com/a/16516670</a>
 */
public class APIzator16516670 {

  public static void storeHashmap(List<String> arraylist1)
    throws Exception {
    // This is the final list you need
    List<Map<String, List<String>>> list = new ArrayList<Map<String, List<String>>>();
    // This is one instance of the  map you want to store in the above list.
    Map<String, List<String>> map1 = new HashMap<String, List<String>>();
    map1.put("key1", arraylist1);
    // And so on...
    // In this way you can add.
    list.add(map1);
  }
}
