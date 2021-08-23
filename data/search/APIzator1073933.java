package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * How to convert int[] into List<Integer> in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1073933">https://stackoverflow.com/a/1073933</a>
 */
public class APIzator1073933 {

  public static void convertInt(int[] ints) throws Exception {
    List<Integer> intList = new ArrayList<Integer>();
    for (int i : ints) {
      intList.add(i);
    }
  }
}
