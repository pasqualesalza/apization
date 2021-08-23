package com.stackoverflow.api;

/**
 * How to remove the backslash in string using regex in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2242486">https://stackoverflow.com/a/2242486</a>
 */
public class APIzator2242486 {

  public static void removeBackslash(String str) throws Exception {
    str = str.replaceAll("\\\\", "");
    str = str.replace("\\", "");
  }
}
