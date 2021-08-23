package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * find out the elements of an arraylist which is not present in another arraylist
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13286094">https://stackoverflow.com/a/13286094</a>
 */
public class APIzator13286094 {

  public static void find(Collection b, int a) throws Exception {
    List<Integer> c = new ArrayList<>(a);
    c.removeAll(b);
  }
}
