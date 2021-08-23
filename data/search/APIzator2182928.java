package com.stackoverflow.api;

/**
 * Java convert float to integer
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2182928">https://stackoverflow.com/a/2182928</a>
 */
public class APIzator2182928 {

  public static String convertFloat(int f) throws Exception {
    int i = (int) f;
    return (i == f) ? String.valueOf(i) : String.valueOf(f);
  }
}
