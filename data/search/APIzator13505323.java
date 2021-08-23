package com.stackoverflow.api;

/**
 * Java: println with char array gives gibberish
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13505323">https://stackoverflow.com/a/13505323</a>
 */
public class APIzator13505323 {

  public static String giveGibberish(String b) throws Exception {
    System.out.println(b);
    System.out.println("char[] b: " + b);
    return new String(b);
  }
}
