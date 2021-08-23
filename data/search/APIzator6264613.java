package com.stackoverflow.api;

/**
 * Number of decimal digits in a double
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6264613">https://stackoverflow.com/a/6264613</a>
 */
public class APIzator6264613 {

  public static int number(double d) throws Exception {
    String text = Double.toString(Math.abs(d));
    int integerPlaces = text.indexOf('.');
    return text.length() - integerPlaces - 1;
  }
}
