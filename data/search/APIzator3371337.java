package com.stackoverflow.api;

/**
 * Java: Date from unix timestamp
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3371337">https://stackoverflow.com/a/3371337</a>
 */
public class APIzator3371337 {

  public static java.util.Date java(int timeStamp) throws Exception {
    return new java.util.Date((long) timeStamp * 1000);
  }
}
