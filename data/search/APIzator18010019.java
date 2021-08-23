package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * clearing or set null to objects in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18010019">https://stackoverflow.com/a/18010019</a>
 */
public class APIzator18010019 {

  public static void clear(Map<String, List<String>> map)
    throws Exception {
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = list1;
    list1 = null;
    // Just prints 0
    System.out.println(list2.size());
    list2.add("Foo");
    // Prints Foo
    System.out.println(list1.get(0));
    List<String> list = new ArrayList<String>();
    list = null;
  }
}
