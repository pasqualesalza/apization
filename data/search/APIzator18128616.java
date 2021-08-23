package com.stackoverflow.api;

/**
 * Getting environment variable value in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18128616">https://stackoverflow.com/a/18128616</a>
 */
public class APIzator18128616 {

  public static String getValue() throws Exception {
    return System.getenv("PE_CONF_PWD");
  }
}
