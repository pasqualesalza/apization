package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Populate JSP dropdown with database info
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2901620">https://stackoverflow.com/a/2901620</a>
 */
public class APIzator2901620 {

  public static List<String> getItems() {
    List<String> list = new ArrayList<String>();
    list.add("Thing1");
    list.add("Thing2");
    list.add("Thing3");
    return list;
  }
}
