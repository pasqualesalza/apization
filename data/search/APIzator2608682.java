package com.stackoverflow.api;

/**
 * How can I trim beginning and ending double quotes from a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2608682">https://stackoverflow.com/a/2608682</a>
 */
public class APIzator2608682 {

  public static void trim(String string) throws Exception {
    string = string.replaceAll("^\"|\"$", "");
  }
}
