package com.stackoverflow.api;

/**
 * How can I replace non-printable Unicode characters in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6199346">https://stackoverflow.com/a/6199346</a>
 */
public class APIzator6199346 {

  public static void replaceCharacter(String my_string)
    throws Exception {
    my_string.replaceAll("\\p{C}", "?");
  }
}
