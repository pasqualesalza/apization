package com.stackoverflow.api;

/**
 * Fastest way to get number of digits on a number?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15587842">https://stackoverflow.com/a/15587842</a>
 */
public class APIzator15587842 {

  public static int way(int number) throws Exception {
    int length = (int) Math.log10(number) + 1;
    return length;
  }
}
