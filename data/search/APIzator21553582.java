package com.stackoverflow.api;

/**
 * How to check null on StringBuilder?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21553582">https://stackoverflow.com/a/21553582</a>
 */
public class APIzator21553582 {

  public static void checkNull(StringBuilder nullBuilder)
    throws Exception {
    if (nullBuilder == null) {
      System.out.println("Builder is null");
    }
    StringBuilder emptyBuilder = new StringBuilder("");
    if (emptyBuilder == null || emptyBuilder.toString().equals("")) {
      System.out.println("Builder is empty");
    }
  }
}
