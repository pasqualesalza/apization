package com.stackoverflow.api;

/**
 * Output in a table format in Java's System.out
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2745239">https://stackoverflow.com/a/2745239</a>
 */
public class APIzator2745239 {

  public static void output(int string2, int string1, int int1)
    throws Exception {
    System.out.format("%32s%10d%16s", string1, int1, string2);
  }
}
