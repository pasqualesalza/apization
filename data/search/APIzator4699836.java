package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Sort ArrayList of Array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4699836">https://stackoverflow.com/a/4699836</a>
 */
public class APIzator4699836 {

  public static void arraylist(ArrayList<String[]> listOfStringArrays)
    throws Exception {
    Collections.sort(
      listOfStringArrays,
      new Comparator<String[]>() {
        public int compare(String[] strings, String[] otherStrings) {
          return strings[1].compareTo(otherStrings[1]);
        }
      }
    );
    for (String[] sa : listOfStringArrays) {
      System.out.println(Arrays.toString(sa));
    }
    /* prints out 
          [a, b, c]
          [m, n, o]
          [x, y, z]
        */
  }
}
