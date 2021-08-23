package com.stackoverflow.api;

/**
 * How to use String.format() in Java to replicate tab "\t"?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13789157">https://stackoverflow.com/a/13789157</a>
 */
public class APIzator13789157 {

  public static void useStringformat(
    String[] firstNames,
    String[] lastNames,
    String phoneNumber
  ) {
    for (int i = 0; i < firstNames.length; i++) {
      String foo = String.format(
        "%-20s %s",
        lastNames[i] + ", " + firstNames[i],
        phoneNumber
      );
      System.out.println(foo);
    }
  }
}
