package com.stackoverflow.api;

/**
 * Comparing two string and sorting them in alphabetical order
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20445963">https://stackoverflow.com/a/20445963</a>
 */
public class APIzator20445963 {

  public static void compareString(String a, String b) throws Exception {
    int compare = a.compareTo(b);
    if (compare < 0) {
      System.out.println(a + " is before " + b);
    } else if (compare > 0) {
      System.out.println(b + " is before " + a);
    } else {
      System.out.println(b + " is same as " + a);
    }
  }
}
