package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert list to array. java.lang.ArrayStoreException
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8849259">https://stackoverflow.com/a/8849259</a>
 */
public class APIzator8849259 {

  public static Integer[][] list(List<Integer[]> myList)
    throws Exception {
    return myList.toArray(new Integer[myList.size()][]);
  }
}
