package com.stackoverflow.api;

/**
 * Difference between volatile and synchronized in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3519736">https://stackoverflow.com/a/3519736</a>
 */
public class APIzator3519736 {

  public static void updateCounter() {
    int counter = 0;
    if (counter == 1000) {
      counter = 0;
    } else {
      counter++;
    }
  }
}
