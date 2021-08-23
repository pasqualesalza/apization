package com.stackoverflow.api;

/**
 * In java, how would I find the nth Fibonacci number?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13021152">https://stackoverflow.com/a/13021152</a>
 */
public class APIzator13021152 {

  public static void findNumber(int n) throws Exception {
    int num2 = 0;
    int num = 0;
    int loop = 0;
    int fibonacci = 0;
    for (loop = 0; loop < n; loop++) {
      fibonacci = num + num2;
      num = num2;
      num2 = fibonacci;
    }
    System.out.print(num);
  }
}
