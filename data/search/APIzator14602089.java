package com.stackoverflow.api;

/**
 * Java String split removed empty values
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14602089">https://stackoverflow.com/a/14602089</a>
 */
public class APIzator14602089 {

  public static String[] removeValue(String data) throws Exception {
    return data.split("\\|", -1);
  }
}
