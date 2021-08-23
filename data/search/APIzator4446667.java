package com.stackoverflow.api;

/**
 * Java: String: equalsIgnoreCase vs switching everything to Upper/Lower Case
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4446667">https://stackoverflow.com/a/4446667</a>
 */
public class APIzator4446667 {

  public static void java(String myOtherString, String myString)
    throws Exception {
    if (myString.toUpperCase().equals(myOtherString.toUpperCase())) {}
    if (myString.equalsIgnoreCase(myOtherString)) {}
  }
}
