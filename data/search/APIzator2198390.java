package com.stackoverflow.api;

/**
 * Java - How to split a string on plus signs?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2198390">https://stackoverflow.com/a/2198390</a>
 */
public class APIzator2198390 {

  public static String[] splitString(String expression)
    throws Exception {
    return expression.split("\\+");
  }
}
