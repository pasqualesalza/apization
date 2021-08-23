package com.stackoverflow.api;

/**
 * Remove a trailing slash from a string(changed from url type) in JAVA
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5437524">https://stackoverflow.com/a/5437524</a>
 */
public class APIzator5437524 {

  public static void removeSlash(String s) throws Exception {
    s = s.replaceAll("/$", "");
    s = s.replaceAll("/\\z", "");
    if (s.endsWith("/")) {
      s = s.substring(0, s.length() - 1);
    }
    s = s.substring(0, s.length() - (s.endsWith("/") ? 1 : 0));
  }
}
