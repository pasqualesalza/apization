package com.stackoverflow.api;

/**
 * java.io.FileNotFoundException: class path resource [WEB-INF/classes/library.properties] cannot be opened because it does not exist
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24598145">https://stackoverflow.com/a/24598145</a>
 */
public class APIzator24598145 {

  public static String javaio() throws Exception {
    return System.getProperty("java.class.path");
  }
}
