package com.stackoverflow.api;

/**
 * removing invalid XML characters from a string in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4237934">https://stackoverflow.com/a/4237934</a>
 */
public class APIzator4237934 {

  public static void removeCharacter(
    String pattern,
    String xml10pattern,
    String xml11pattern,
    String illegal
  ) throws Exception {
    // XML 1.0
    // XML 1.1
    String legal = illegal.replaceAll(pattern, "");
  }
}
