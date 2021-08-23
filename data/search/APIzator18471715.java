package com.stackoverflow.api;

/**
 * How can I add escape characters to a Java String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18471715">https://stackoverflow.com/a/18471715</a>
 */
public class APIzator18471715 {

  public static String addCharacter(String example) {
    example = example.replaceAll("'", "\\\\'");
    example = example.replaceAll("\"", "\\\\\"");
    return example;
  }
}
