package com.stackoverflow.api;

/**
 * Setting JVM parameters at runtime
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1754131">https://stackoverflow.com/a/1754131</a>
 */
public class APIzator1754131 {

  public static String setParameter() throws Exception {
    System.setProperty("propname", "hello world");
    return System.getProperty("propname");
  }
}
