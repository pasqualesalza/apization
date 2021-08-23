package com.stackoverflow.api;

/**
 * Remove the last chars of the Java String variable
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9125274">https://stackoverflow.com/a/9125274</a>
 */
public class APIzator9125274 {

  public static void removeChar(int name, int extension, String path)
    throws Exception {
    path = path.substring(0, path.length() - 5);
    if (path.endsWith(".null")) {
      path = path.substring(0, path.length() - 5);
    }
    path = name + "." + extension;
  }
}
