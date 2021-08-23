package com.stackoverflow.api;

/**
 * Get current working directory in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3153440">https://stackoverflow.com/a/3153440</a>
 */
public class APIzator3153440 {

  public static String getDirectory() {
    final String dir = System.getProperty("user.dir");
    return dir;
  }
}
