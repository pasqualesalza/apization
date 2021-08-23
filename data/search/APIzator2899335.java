package com.stackoverflow.api;

/**
 * How do I increment a variable to the next or previous letter in the alphabet?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2899335">https://stackoverflow.com/a/2899335</a>
 */
public class APIzator2899335 {

  public static String incrementVariable(String value) throws Exception {
    int charValue = value.charAt(0);
    String next = String.valueOf((char) (charValue + 1));
    return next;
  }
}
