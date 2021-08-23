package com.stackoverflow.api;

/**
 * How to remove only trailing spaces of a string in Java and keep leading spaces?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16974310">https://stackoverflow.com/a/16974310</a>
 */
public class APIzator16974310 {

  public static String removeTrail(String text) throws Exception {
    return text.replaceFirst("\\s++$", "");
  }
}
