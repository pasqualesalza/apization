package com.stackoverflow.api;

/**
 * Split Java String into Two String using delimiter
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7787412">https://stackoverflow.com/a/7787412</a>
 */
public class APIzator7787412 {

  public static String useDelimiter() throws Exception {
    String[] str_array = "name:score".split(":");
    String stringa = str_array[0];
    return str_array[1];
  }
}
