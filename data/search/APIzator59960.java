package com.stackoverflow.api;

import java.net.MalformedURLException;

/**
 * getting java exception: java.net.MalformedURLException: no protocol
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/59960">https://stackoverflow.com/a/59960</a>
 */
public class APIzator59960 {

  public static void getException() {
    try {
      java.net.URL connection_url = new java.net.URL("http://:/path");
      System.out.println("Instantiated new URL: " + connection_url);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
