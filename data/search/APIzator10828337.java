package com.stackoverflow.api;

/**
 * Remove string after last occurrence of a character
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10828337">https://stackoverflow.com/a/10828337</a>
 */
public class APIzator10828337 {

  public static void removeString(String str) throws Exception {
    if (null != str && str.length() > 0) {
      int endIndex = str.lastIndexOf("/");
      if (endIndex != -1) {
        // not forgot to put check if(endIndex != -1)
        String newstr = str.substring(0, endIndex);
      }
    }
  }
}
