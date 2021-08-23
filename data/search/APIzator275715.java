package com.stackoverflow.api;

/**
 * Add leading zeroes to number in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/275715">https://stackoverflow.com/a/275715</a>
 */
public class APIzator275715 {

  public static String addZero(int num) throws Exception {
    return String.format("%03d", num);
  }
}
