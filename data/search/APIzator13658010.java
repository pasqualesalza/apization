package com.stackoverflow.api;

/**
 * How to remove bad characters that are not suitable for utf8 encoding in MySQL?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13658010">https://stackoverflow.com/a/13658010</a>
 */
public class APIzator13658010 {

  public static String removeBadChars(String s) {
    if (s == null) return null;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (Character.isHighSurrogate(s.charAt(i))) continue;
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }
}
