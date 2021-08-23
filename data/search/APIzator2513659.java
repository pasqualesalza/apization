package com.stackoverflow.api;

/**
 * bitwise not operator
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2513659">https://stackoverflow.com/a/2513659</a>
 */
public class APIzator2513659 {

  public static void operator() throws Exception {
    System.out.println(Integer.toBinaryString(~0));
    // prints "11111111111111111111111111111111"
    System.out.println(Integer.toBinaryString(~1));
    // prints "11111111111111111111111111111110"
  }
}
