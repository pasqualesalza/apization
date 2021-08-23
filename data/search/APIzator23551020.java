package com.stackoverflow.api;

/**
 * How to break a while loop from an if condition inside the while loop?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23551020">https://stackoverflow.com/a/23551020</a>
 */
public class APIzator23551020 {

  public static int breakLoop() {
    int i = 0;
    while (i++ < 10) {
      if (i == 5) break;
    }
    return i;
  }
}
