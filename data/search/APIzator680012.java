package com.stackoverflow.api;

/**
 * Find out number of bits needed to represent a positive integer in binary?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/680012">https://stackoverflow.com/a/680012</a>
 */
public class APIzator680012 {

  public static void find() throws Exception {
    int value = 11;
    int count = 0;
    while (value > 0) {
      count++;
      value = value >> 1;
    }
  }
}
