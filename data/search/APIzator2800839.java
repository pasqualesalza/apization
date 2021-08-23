package com.stackoverflow.api;

/**
 * How to remove leading zeros from alphanumeric text?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2800839">https://stackoverflow.com/a/2800839</a>
 */
public class APIzator2800839 {

  public static void removeZero(String[] in) throws Exception {
    for (String s : in) {
      System.out.println("[" + s.replaceFirst("^0+(?!$)", "") + "]");
    }
  }
}
