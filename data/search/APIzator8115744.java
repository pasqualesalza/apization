package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Generating Unique Random Numbers in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8115744">https://stackoverflow.com/a/8115744</a>
 */
public class APIzator8115744 {

  public static void generateNumbers() {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i < 11; i++) {
      list.add(new Integer(i));
    }
    Collections.shuffle(list);
    for (int i = 0; i < 3; i++) {
      System.out.println(list.get(i));
    }
  }
}
