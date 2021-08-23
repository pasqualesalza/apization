package com.stackoverflow.api;

/**
 * Java Round up Any Number
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4540700">https://stackoverflow.com/a/4540700</a>
 */
public class APIzator4540700 {

  public static void round(int a) throws Exception {
    System.out.println(a / 100);
    System.out.println(Math.ceil(a / 100));
    System.out.println(a / 100.0);
    System.out.println(Math.ceil(a / 100.0));
    System.out.println((int) Math.ceil(a / 100.0));
  }
}
