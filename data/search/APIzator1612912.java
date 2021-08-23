package com.stackoverflow.api;

/**
 * How to remove the carriage return from string while pasting content to Excel file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1612912">https://stackoverflow.com/a/1612912</a>
 */
public class APIzator1612912 {

  public static String removeReturn(String s1) throws Exception {
    String s2 = s1.replaceAll("[\n\r]", "");
    return s2;
  }
}
