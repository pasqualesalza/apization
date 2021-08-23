package com.stackoverflow.api;

/**
 * Is there a difference between x++ and ++x in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1094894">https://stackoverflow.com/a/1094894</a>
 */
public class APIzator1094894 {

  public static int be() throws Exception {
    int x = 5, y = 5;
    // outputs 6
    System.out.println(++x);
    // outputs 6
    System.out.println(x);
    // outputs 5
    System.out.println(y++);
    return y;
  }
}
