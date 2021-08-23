package com.stackoverflow.api;

/**
 * Java replace all square brackets in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14442189">https://stackoverflow.com/a/14442189</a>
 */
public class APIzator14442189 {

  public static void replaceBracket(String str) throws Exception {
    str = str.replaceAll("\\[", "").replaceAll("\\]", "");
  }
}
