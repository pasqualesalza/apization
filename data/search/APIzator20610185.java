package com.stackoverflow.api;

import java.util.Map;

/**
 * Can we read the OS environment variables in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20610185">https://stackoverflow.com/a/20610185</a>
 */
public class APIzator20610185 {

  public static void readVariable() {
    Map<String, String> env = System.getenv();
    for (String envName : env.keySet()) {
      System.out.format("%s=%s%n", envName, env.get(envName));
    }
  }
}
