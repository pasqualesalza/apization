package com.stackoverflow.api;

/**
 * How do I split a string with any whitespace chars as delimiters?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/225360">https://stackoverflow.com/a/225360</a>
 */
public class APIzator225360 {

  public static void splitString(String myString) throws Exception {
    myString.split("\\s+");
  }
}
