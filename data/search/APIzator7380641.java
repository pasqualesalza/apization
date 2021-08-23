package com.stackoverflow.api;

/**
 * How to Replace dot (.) in a string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7380641">https://stackoverflow.com/a/7380641</a>
 */
public class APIzator7380641 {

  public static void replaceDot(String xpath, String str)
    throws Exception {
    // replaces a literal . with /*/
    str = xpath.replaceAll("\\.", "/*/");
  }
}
