package com.stackoverflow.api;

/**
 * Java reverse an int value without using array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3806212">https://stackoverflow.com/a/3806212</a>
 */
public class APIzator3806212 {

  public static void reverseValue() throws Exception {
    int last_digit = 0;
    int input = 0;
    int reversedNum = 0;
    while (input != 0) {
      last_digit = input % 10;
      if (last_digit % 2 != 0) {
        reversedNum = reversedNum * 10 + last_digit;
      }
      input = input / 10;
    }
  }
}
