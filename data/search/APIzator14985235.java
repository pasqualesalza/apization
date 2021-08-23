package com.stackoverflow.api;

/**
 * Remove trailing zero in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14985235">https://stackoverflow.com/a/14985235</a>
 */
public class APIzator14985235 {

  public static void remove(String s) throws Exception {
    s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
  }
}
