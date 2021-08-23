package com.stackoverflow.api;

/**
 * How to get the numbers after the decimal point? (java)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6166770">https://stackoverflow.com/a/6166770</a>
 */
public class APIzator6166770 {

  public static double getNumber(int d) throws Exception {
    return d - Math.floor(d);
  }
}
