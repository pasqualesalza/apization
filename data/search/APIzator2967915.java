package com.stackoverflow.api;

/**
 * Retrieving the first digit of a number
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2967915">https://stackoverflow.com/a/2967915</a>
 */
public class APIzator2967915 {

  public static int retrieveDigit(int number) throws Exception {
    return Integer.parseInt(Integer.toString(number).substring(0, 1));
  }
}
