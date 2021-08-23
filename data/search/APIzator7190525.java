package com.stackoverflow.api;

/**
 * How to read String Builder line by line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7190525">https://stackoverflow.com/a/7190525</a>
 */
public class APIzator7190525 {

  public static void readLine(StringBuilder sb) throws Exception {
    String[] lines = sb.toString().split("\\n");
    for (String s : lines) {
      System.out.println("Content = " + s);
      System.out.println("Length = " + s.length());
    }
  }
}
