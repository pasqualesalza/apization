package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * How to store arrayList into an array in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5244298">https://stackoverflow.com/a/5244298</a>
 */
public class APIzator5244298 {

  public static void storeArraylist() throws Exception {
    List<String> list = new ArrayList<String>();
    // add items to the list
    Object[] arrOfObjects = new Object[] { list };
    List<?>[] arrOfLists = new List<?>[] { list };
    Object[] arrayOfObjects = list.toArray();
    String[] arrayOfStrings = list.toArray(new String[list.size()]);
  }
}
