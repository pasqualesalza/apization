package com.stackoverflow.api;

/**
 * How to sum digits of an integer in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27096697">https://stackoverflow.com/a/27096697</a>
 */
public class APIzator27096697 {

  public static int sumDigit() {
    int num = 321;
    int sum = 0;
    while (num > 0) {
      sum = sum + num % 10;
      num = num / 10;
    }
    return sum;
  }
}
