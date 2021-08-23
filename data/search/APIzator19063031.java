package com.stackoverflow.api;

/**
 * Extracting digits of int in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19063031">https://stackoverflow.com/a/19063031</a>
 */
public class APIzator19063031 {

  public static void extractDigit() throws Exception {
    int n = 128;
    while (n > 0) {
      int d = n / 10;
      int k = n - d * 10;
      n = d;
      System.out.println(k);
    }
  }
}
