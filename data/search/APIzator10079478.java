package com.stackoverflow.api;

/**
 * Splitting a string with multiple spaces
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10079478">https://stackoverflow.com/a/10079478</a>
 */
public class APIzator10079478 {

  public static String[] splitString(String s) throws Exception {
    return s.split(" +");
  }
}
