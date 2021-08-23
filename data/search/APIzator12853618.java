package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How to add elements of a string array to a string array list?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12853618">https://stackoverflow.com/a/12853618</a>
 */
public class APIzator12853618 {

  public static void addElement(String speciesArr, String[] arr)
    throws Exception {
    List<String> species = Arrays.asList(speciesArr);
    List<String> newList = Arrays.asList(arr);
    // Will throw `UnsupportedOperationException
    // newList.add("jain"); // Can't do this.
    ArrayList<String> updatableList = new ArrayList<String>();
    updatableList.addAll(newList);
    // OK this is fine.
    updatableList.add("jain");
    // Prints [rohit]
    System.out.println(newList);
    // Prints [rohit, jain]
    System.out.println(updatableList);
  }
}
