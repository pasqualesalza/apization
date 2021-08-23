package com.stackoverflow.api;

/**
 * Java split string to array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14414642">https://stackoverflow.com/a/14414642</a>
 */
public class APIzator14414642 {

  public static String[] splitString(String values) throws Exception {
    return values.split("\\|", -1);
  }
}
