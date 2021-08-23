package com.stackoverflow.api;

/**
 * Determine JRE architecture 32-bit vs 64-bit
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12105297">https://stackoverflow.com/a/12105297</a>
 */
public class APIzator12105297 {

  public static void architecture() throws Exception {
    System.getProperty("sun.arch.data.model");
  }
}
