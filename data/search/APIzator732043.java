package com.stackoverflow.api;

/**
 * Getting "unixtime" in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/732043">https://stackoverflow.com/a/732043</a>
 */
public class APIzator732043 {

  public static long getUnixtime() throws Exception {
    return System.currentTimeMillis() / 1000L;
  }
}
