package com.stackoverflow.api;

import java.util.Random;

/**
 * Is there functionality to generate a random character in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2626989">https://stackoverflow.com/a/2626989</a>
 */
public class APIzator2626989 {

  public static void be(String alphabet) throws Exception {
    // ...
    Random r = new Random();
    for (int i = 0; i < 50; i++) {
      System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
    }
    // prints 50 random characters from alphabet
  }
}
