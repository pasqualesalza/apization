package com.stackoverflow.api;

/**
 * java regex: find pattern of 1 or more numbers followed by a single
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10952365">https://stackoverflow.com/a/10952365</a>
 */
public class APIzator10952365 {

  public static void findPattern(String searchText) throws Exception {
    searchText.matches("\\d+\\.[^.]");
  }
}
