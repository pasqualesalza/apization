package com.stackoverflow.api;

/**
 * Read String line by line
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1096633">https://stackoverflow.com/a/1096633</a>
 */
public class APIzator1096633 {

  public static String[] line(String myString) throws Exception {
    return myString.split(System.getProperty("line.separator"));
  }
}
