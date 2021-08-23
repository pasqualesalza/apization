package com.stackoverflow.api;

/**
 * Parsing string to double - java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13166447">https://stackoverflow.com/a/13166447</a>
 */
public class APIzator13166447 {

  public static double parseString(String currentBalanceStr)
    throws Exception {
    return Double.parseDouble(currentBalanceStr.replaceAll(" ", "."));
  }
}
