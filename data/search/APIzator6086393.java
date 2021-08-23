package com.stackoverflow.api;

import java.util.regex.PatternSyntaxException;

/**
 * Split String into an array of String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6086393">https://stackoverflow.com/a/6086393</a>
 */
public class APIzator6086393 {

  public static void string(String input) throws Exception {
    try {
      String[] splitArray = input.split("\\s+");
    } catch (PatternSyntaxException ex) {
      //
    }
  }
}
