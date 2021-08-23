package com.stackoverflow.api;

/**
 * Java: parse int value from a char
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4968343">https://stackoverflow.com/a/4968343</a>
 */
public class APIzator4968343 {

  public static int java(String element) throws Exception {
    int x = Character.getNumericValue(element.charAt(2));
    return x;
  }
}
