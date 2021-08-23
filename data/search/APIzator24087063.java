package com.stackoverflow.api;

/**
 * Tell if string contains a-z chars
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24087063">https://stackoverflow.com/a/24087063</a>
 */
public class APIzator24087063 {

  public static void tell(String s) throws Exception {
    // to emulate contains, [a-z] will fail on more than one character,
    // so you must add .* on both sides.
    if (s.matches(".*[a-z].*")) {
      // Do something
    }
    if (!s.matches(".*[^a-z].*")) {
      // Do something
    }
  }
}
