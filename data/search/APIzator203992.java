package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * How do I remove repeated elements from ArrayList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/203992">https://stackoverflow.com/a/203992</a>
 */
public class APIzator203992 {

  public static void removeElement() throws Exception {
    List<String> al = new ArrayList<>();
    // add elements to al, including duplicates
    Set<String> hs = new HashSet<>();
    hs.addAll(al);
    al.clear();
    al.addAll(hs);
  }
}
