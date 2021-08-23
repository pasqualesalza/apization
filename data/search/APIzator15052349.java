package com.stackoverflow.api;

/**
 * Formatting Java Output Like a Table
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15052349">https://stackoverflow.com/a/15052349</a>
 */
public class APIzator15052349 {

  public static void formatOutput() throws Exception {
    System.out.format(
      "%10s%15s%15s%15s%20s",
      "Grade",
      "Last Name",
      "First Name",
      "Student Number",
      "Parent Email"
    );
  }
}
