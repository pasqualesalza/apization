package com.stackoverflow.api;

import java.util.Random;

/**
 * Getting random numbers in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5887745">https://stackoverflow.com/a/5887745</a>
 */
public class APIzator5887745 {

  public static void getNumber() throws Exception {
    Random rand = new Random();
    int n = rand.nextInt(50) + 1;
    // 50 is the maximum and the 1 is our minimum
  }
}
