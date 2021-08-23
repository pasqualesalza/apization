package com.stackoverflow.api;

/**
 * How to get the execution directory path in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17939617">https://stackoverflow.com/a/17939617</a>
 */
public class APIzator17939617 {

  public static String getPath() {
    final String dir = System.getProperty("user.dir");
    return dir;
  }
}
