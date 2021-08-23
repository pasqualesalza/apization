package com.stackoverflow.api;

/**
 * How to create a temp file in java without the random number appended to the filename?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9594927">https://stackoverflow.com/a/9594927</a>
 */
public class APIzator9594927 {

  public static String createFile() throws Exception {
    return System.getProperty("java.io.tmpdir");
  }
}
