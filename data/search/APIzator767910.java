package com.stackoverflow.api;

/**
 * Occurrences of substring in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/767910">https://stackoverflow.com/a/767910</a>
 */
public class APIzator767910 {

  public static int occurrence(String str, String findStr)
    throws Exception {
    int lastIndex = 0;
    int count = 0;
    while (lastIndex != -1) {
      lastIndex = str.indexOf(findStr, lastIndex);
      if (lastIndex != -1) {
        count++;
        lastIndex += findStr.length();
      }
    }
    return count;
  }
}
