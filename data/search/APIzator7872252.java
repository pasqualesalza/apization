package com.stackoverflow.api;

import java.util.Locale;

/**
 * %s in String.format for numbers
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7872252">https://stackoverflow.com/a/7872252</a>
 */
public class APIzator7872252 {

  public static void s() {
    Locale.setDefault(new Locale("hi", "IN"));
    System.out.printf("String: %s; Number: %d\n", 1234, 1234);
  }
}
