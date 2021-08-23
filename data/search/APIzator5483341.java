package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * How does one convert a HashMap to a List in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5483341">https://stackoverflow.com/a/5483341</a>
 */
public class APIzator5483341 {

  public static void convertHashmap(HashMap<Integer, String> map)
    throws Exception {
    List<String> list = new ArrayList<String>(map.values());
    for (String s : list) {
      System.out.println(s);
    }
  }
}
