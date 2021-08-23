package com.stackoverflow.api;

/**
 * Setting user agent of a java URLConnection
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2529903">https://stackoverflow.com/a/2529903</a>
 */
public class APIzator2529903 {

  public static void setAgent() throws Exception {
    System.setProperty("http.agent", "");
  }
}
