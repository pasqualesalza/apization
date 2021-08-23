package com.stackoverflow.api;

/**
 * Replace Last Occurrence of a character in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16665502">https://stackoverflow.com/a/16665502</a>
 */
public class APIzator16665502 {

  public static String replaceOccurrence() throws Exception {
    String str = "\"Position, fix, dial\"";
    int ind = str.lastIndexOf("\"");
    if (ind >= 0) str =
      new StringBuilder(str).replace(ind, ind + 1, "\\\"").toString();
    return str;
  }
}
