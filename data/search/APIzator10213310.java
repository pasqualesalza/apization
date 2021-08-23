package com.stackoverflow.api;

/**
 * Compare one String with multiple values in one expression
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10213310">https://stackoverflow.com/a/10213310</a>
 */
public class APIzator10213310 {

  public static void compareString(String str) throws Exception {
    if (str.matches("val1|val2|val3")) {
      // remaining code
    }
    if (str.matches("(?i)val1|val2|val3")) {
      // remaining code
    }
  }
}
