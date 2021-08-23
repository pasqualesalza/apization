package com.stackoverflow.api;

/**
 * Java doesn't work with regex \s, says: invalid escape sequence
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2733263">https://stackoverflow.com/a/2733263</a>
 */
public class APIzator2733263 {

  public static void say(String start_from) throws Exception {
    start_from = start_from.replaceAll("\\s", "+");
  }
}
