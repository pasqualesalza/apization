package com.stackoverflow.api;

/**
 * Java - Trim leading or trailing characters from a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25691614">https://stackoverflow.com/a/25691614</a>
 */
public class APIzator25691614 {

  public static String character() throws Exception {
    System.out.println("//test/me".replaceAll("^/+", ""));
    return "//test/me//".replaceAll("/+$", "");
  }
}
