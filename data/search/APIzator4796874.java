package com.stackoverflow.api;

/**
 * Double value to round up in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4796874">https://stackoverflow.com/a/4796874</a>
 */
public class APIzator4796874 {

  public static double value(int value) throws Exception {
    return Math.round(value * 100.0) / 100.0;
  }
}
