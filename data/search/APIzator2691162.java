package com.stackoverflow.api;

/**
 * DecimalFormat and Double.valueOf()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2691162">https://stackoverflow.com/a/2691162</a>
 */
public class APIzator2691162 {

  public static void decimalformat(double value) throws Exception {
    value = Math.round(value * 1e5) / 1e5;
  }
}
