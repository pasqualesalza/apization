package com.stackoverflow.api;

/**
 * Replace last part of string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1660047">https://stackoverflow.com/a/1660047</a>
 */
public class APIzator1660047 {

  public static void replace(String yourString) throws Exception {
    StringBuilder b = new StringBuilder(yourString);
    b.replace(
      yourString.lastIndexOf(","),
      yourString.lastIndexOf(",") + 1,
      ")"
    );
    yourString = b.toString();
  }
}
