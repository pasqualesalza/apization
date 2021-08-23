package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * How to search for a string in an arraylist
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8192887">https://stackoverflow.com/a/8192887</a>
 */
public class APIzator8192887 {

  public static List<String> search(List<String> list) throws Exception {
    List<String> listClone = new ArrayList<String>();
    for (String string : list) {
      if (string.matches("(?i)(bea).*")) {
        listClone.add(string);
      }
    }
    return listClone;
  }
}
