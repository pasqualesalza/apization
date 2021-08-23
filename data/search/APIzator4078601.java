package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * How to avoid ConcurrentModificationException when iterating over a map and changing values?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4078601">https://stackoverflow.com/a/4078601</a>
 */
public class APIzator4078601 {

  public static void avoidConcurrentmodificationexception()
    throws Exception {
    Map<String, String> map;
    Map.Entry<String, String> entry;
    Iterator<Map.Entry<String, String>> it;
    // Create the map
    map = new HashMap<String, String>();
    map.put("one", "uno");
    map.put("two", "due");
    map.put("three", "tre");
    // Iterate through the entries, changing one of them
    it = map.entrySet().iterator();
    while (it.hasNext()) {
      entry = it.next();
      System.out.println("Visiting " + entry.getKey());
      if (entry.getKey().equals("two")) {
        System.out.println("Modifying it");
        entry.setValue("DUE");
      }
    }
    // Show the result
    it = map.entrySet().iterator();
    while (it.hasNext()) {
      entry = it.next();
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }
  }
}
