package com.stackoverflow.api;

import java.util.HashMap;

/**
 * How to count frequency of characters in a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6712708">https://stackoverflow.com/a/6712708</a>
 */
public class APIzator6712708 {

  public static void countFrequency(String s) throws Exception {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      Integer val = map.get(c);
      if (val != null) {
        map.put(c, new Integer(val + 1));
      } else {
        map.put(c, 1);
      }
    }
  }
}
