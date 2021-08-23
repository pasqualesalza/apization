package com.stackoverflow.api;

/**
 * How to get the last characters in a String in Java, regardless of String size
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3243779">https://stackoverflow.com/a/3243779</a>
 */
public class APIzator3243779 {

  public static String[] getCharacter(String s) throws Exception {
    s.substring(s.lastIndexOf(':') + 1);
    s.substring(s.lastIndexOf(' ') + 1);
    return s.split("[^0-9]+");
  }
}
