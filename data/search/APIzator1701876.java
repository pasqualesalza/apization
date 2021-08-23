package com.stackoverflow.api;

/**
 * String.replaceAll single backslashes with double backslashes
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1701876">https://stackoverflow.com/a/1701876</a>
 */
public class APIzator1701876 {

  public static void backslashe(String string) throws Exception {
    string.replaceAll("\\\\", "\\\\\\\\");
    string.replace("\\", "\\\\");
  }
}
