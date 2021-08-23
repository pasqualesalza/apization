package com.stackoverflow.api;

/**
 * How can I iterate over a string in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6178803">https://stackoverflow.com/a/6178803</a>
 */
public class APIzator6178803 {

  public static Boolean cmprStr(String s1, String s2) {
    for (int i = s1.length() - 1; i >= 0; --i) {
      if (s2.indexOf(s1.charAt(i)) == -1) {
        return Boolean.FALSE;
      }
    }
    return Boolean.TRUE;
  }
}
