package com.stackoverflow.api;

/**
 * How to use substring and indexOf for a String with repeating characters?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16764329">https://stackoverflow.com/a/16764329</a>
 */
public class APIzator16764329 {

  public static String use(String myString) throws Exception {
    return myString.substring(
      myString.indexOf("state(") + 6,
      myString.lastIndexOf(")")
    );
  }
}
