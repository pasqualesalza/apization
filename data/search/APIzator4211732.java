package com.stackoverflow.api;

/**
 * Binary to text in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4211732">https://stackoverflow.com/a/4211732</a>
 */
public class APIzator4211732 {

  public static String binary(String info) throws Exception {
    int charCode = Integer.parseInt(info, 2);
    return new Character((char) charCode).toString();
  }
}
