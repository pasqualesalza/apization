package com.stackoverflow.api;

/**
 * How to remove entire substring from '<' to '>' in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7100516">https://stackoverflow.com/a/7100516</a>
 */
public class APIzator7100516 {

  public static void removeSubstring(String newstr, String str)
    throws Exception {
    newstr = str.replaceAll("<[^>]*>", "");
  }
}
