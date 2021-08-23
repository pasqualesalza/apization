package com.stackoverflow.api;

/**
 * How to split a String by space
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7899558">https://stackoverflow.com/a/7899558</a>
 */
public class APIzator7899558 {

  public static String[] splitString(String str) throws Exception {
    str = "Hello I'm your String";
    return str.split("\\s+");
  }
}
