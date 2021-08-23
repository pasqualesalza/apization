package com.stackoverflow.api;

/**
 * Format double to 2 decimal places with leading 0s
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3973886">https://stackoverflow.com/a/3973886</a>
 */
public class APIzator3973886 {

  public static void formatPlace(String decim, String price)
    throws Exception {
    String s = decim.format(price);
    System.out.println("s is '" + s + "'");
  }
}
