package com.stackoverflow.api;

/**
 * Check if a String is in an ArrayList of Strings
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10208751">https://stackoverflow.com/a/10208751</a>
 */
public class APIzator10208751 {

  public static void check(String bankAccNos, int temp, String no)
    throws Exception {
    temp = bankAccNos.contains(no) ? 1 : 2;
  }
}
