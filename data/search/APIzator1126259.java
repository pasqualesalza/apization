package com.stackoverflow.api;

import java.util.Locale;

/**
 * indexOf Case Sensitive?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1126259">https://stackoverflow.com/a/1126259</a>
 */
public class APIzator1126259 {

  public static void sensitive(String s2, String s1) throws Exception {
    s1 = s1.toLowerCase(Locale.US);
    s2 = s2.toLowerCase(Locale.US);
    s1.indexOf(s2);
  }
}
