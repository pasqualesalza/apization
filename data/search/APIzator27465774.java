package com.stackoverflow.api;

/**
 * String.valueOf() vs. Object.toString()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27465774">https://stackoverflow.com/a/27465774</a>
 */
public class APIzator27465774 {

  public static String stringvalueof(String str) {
    // This will print a String equal to "null"
    System.out.println(String.valueOf(str));
    return str.toString();
  }
}
