package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * i need to find a integer data in arraylist?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9342893">https://stackoverflow.com/a/9342893</a>
 */
public class APIzator9342893 {

  public static void need(ArrayList<Integer> intList) throws Exception {
    // returns false
    intList.contains(-1);
    // returns true
    intList.contains(3);
  }
}
