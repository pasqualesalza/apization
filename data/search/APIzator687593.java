package com.stackoverflow.api;

/**
 * How do I see if a substring exists inside another string in Java 1.4?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/687593">https://stackoverflow.com/a/687593</a>
 */
public class APIzator687593 {

  public static void see(String myStr) throws Exception {
    if (myStr.matches("(?i).*template.*")) {
      // whatever
    }
  }
}
