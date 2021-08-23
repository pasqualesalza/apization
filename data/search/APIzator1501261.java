package com.stackoverflow.api;

/**
 * Change user.home system property
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1501261">https://stackoverflow.com/a/1501261</a>
 */
public class APIzator1501261 {

  public static String change() {
    return System.getProperty("user.home");
  }
}
