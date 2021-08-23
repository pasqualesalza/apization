package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Count occurrences of words in ArrayList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5211215">https://stackoverflow.com/a/5211215</a>
 */
public class APIzator5211215 {

  public static void occurrence(List<String> list) throws Exception {
    Set<String> unique = new HashSet<String>(list);
    for (String key : unique) {
      System.out.println(key + ": " + Collections.frequency(list, key));
    }
  }
}
