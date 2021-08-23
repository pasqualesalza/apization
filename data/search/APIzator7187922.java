package com.stackoverflow.api;

/**
 * Math.ceil and Math.floor returning same value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7187922">https://stackoverflow.com/a/7187922</a>
 */
public class APIzator7187922 {

  public static double mathceil() {
    // Prints 24
    System.out.println(Math.ceil(23.46));
    return Math.floor(23.46);
  }
}
