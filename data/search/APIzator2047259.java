package com.stackoverflow.api;

/**
 * "Auto increment" alphabet in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2047259">https://stackoverflow.com/a/2047259</a>
 */
public class APIzator2047259 {

  public static void alphabet() throws Exception {
    for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
      System.out.println(alphabet);
    }
    for (int i = 65; i <= 90; i++) {
      System.out.println((char) i);
    }
  }
}
