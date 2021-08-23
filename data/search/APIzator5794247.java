package com.stackoverflow.api;

/**
 * How to check if class exists somewhere in package?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5794247">https://stackoverflow.com/a/5794247</a>
 */
public class APIzator5794247 {

  public static void check() throws Exception {
    try {
      Class.forName("your.fqdn.class.name");
    } catch (ClassNotFoundException e) {
      // my class isn't there!
    }
  }
}
