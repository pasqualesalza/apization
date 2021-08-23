package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List intersection in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4349423">https://stackoverflow.com/a/4349423</a>
 */
public class APIzator4349423 {

  public static ArrayList<Integer> intersection() throws Exception {
    List<Integer> original = Arrays.asList(12, 16, 17, 19, 101);
    List<Integer> selected = Arrays.asList(16, 19, 107, 108, 109);
    ArrayList<Integer> add = new ArrayList<Integer>(selected);
    add.removeAll(original);
    System.out.println("Add: " + add);
    ArrayList<Integer> remove = new ArrayList<Integer>(original);
    remove.removeAll(selected);
    return remove;
  }
}
