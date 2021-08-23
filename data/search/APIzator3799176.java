package com.stackoverflow.api;

/**
 * How to iterate through a String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3799176">https://stackoverflow.com/a/3799176</a>
 */
public class APIzator3799176 {

  public static void iterate(String exampleString) throws Exception {
    for (char ch : exampleString.toCharArray()) {
      System.out.println(ch);
    }
  }
}
