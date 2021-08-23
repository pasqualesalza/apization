package com.stackoverflow.api;

import java.util.TreeMap;

/**
 * how to get the one entry from hashmap without iterating
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1509487">https://stackoverflow.com/a/1509487</a>
 */
public class APIzator1509487 {

  public static String getEntry() throws Exception {
    TreeMap<String, String> myMap = new TreeMap<String, String>();
    String first = myMap.firstEntry().getValue();
    return myMap.get(myMap.firstKey());
  }
}
