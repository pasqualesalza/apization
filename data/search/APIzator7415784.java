package com.stackoverflow.api;

/**
 * how to convert double to 2 number after the dot?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7415784">https://stackoverflow.com/a/7415784</a>
 */
public class APIzator7415784 {

  public static void convertNumber(double x) throws Exception {
    x = Math.floor(x * 100) / 100;
  }
}
