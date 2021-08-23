package com.stackoverflow.api;

/**
 * How to replace a word in a String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7577573">https://stackoverflow.com/a/7577573</a>
 */
public class APIzator7577573 {

  public static String replaceWord(String message, String name)
    throws Exception {
    return message.replaceAll("%%NAME", name);
  }
}
