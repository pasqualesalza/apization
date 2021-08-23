package com.stackoverflow.api;

/**
 * Java String.split() Regex
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9857266">https://stackoverflow.com/a/9857266</a>
 */
public class APIzator9857266 {

  public static int stringsplit(String str) throws Exception {
    String[] ops = str.split("\\s*[a-zA-Z]+\\s*");
    String[] notops = str.split("\\s*[^a-zA-Z]+\\s*");
    String[] res = new String[ops.length + notops.length - 1];
    return 0;
  }
}
