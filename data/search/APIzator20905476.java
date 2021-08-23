package com.stackoverflow.api;

/**
 * split string on the last occurrence of character
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20905476">https://stackoverflow.com/a/20905476</a>
 */
public class APIzator20905476 {

  public static void splitString(String filePath) throws Exception {
    int p = filePath.lastIndexOf(".");
    String e = filePath.substring(p + 1);
    if (p == -1 || !e.matches("\\w+")) {
      /* file has no extension */
    } else {
      /* file has extension e */
    }
  }
}
