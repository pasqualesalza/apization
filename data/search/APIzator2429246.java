package com.stackoverflow.api;

/**
 * In Java how does one turn a String into a char or a char into a String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2429246">https://stackoverflow.com/a/2429246</a>
 */
public class APIzator2429246 {

  public static String turnString(String someString, int someChar)
    throws Exception {
    char firstLetter = someString.charAt(0);
    return String.valueOf(someChar);
  }
}
