package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collection;

/**
 * How can I calculate the difference between two ArrayLists?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/919420">https://stackoverflow.com/a/919420</a>
 */
public class APIzator919420 {

  public static void calculateDifference(
    Collection firstList,
    Collection secondList
  ) throws Exception {
    // Create a couple ArrayList objects and populate them
    // Show the "before" lists
    System.out.println("First List: " + firstList);
    System.out.println("Second List: " + secondList);
    // Remove all elements in firstList from secondList
    secondList.removeAll(firstList);
    // Show the "after" list
    System.out.println("Result: " + secondList);
  }
}
