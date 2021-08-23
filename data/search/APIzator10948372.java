package com.stackoverflow.api;

import java.util.HashMap;

/**
 * Does Java have a data structure that stores key value pairs, equivalent to IDictionary in C#?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10948372">https://stackoverflow.com/a/10948372</a>
 */
public class APIzator10948372 {

  public static void haveStructure() throws Exception {
    HashMap<String, Integer> dicCodeToIndex;
    dicCodeToIndex = new HashMap<String, Integer>();
    // valuating
    dicCodeToIndex.put("123", 1);
    dicCodeToIndex.put("456", 2);
    // retrieving
    int index = dicCodeToIndex.get("123");
    // index is 1
  }
}
