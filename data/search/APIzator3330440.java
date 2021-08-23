package com.stackoverflow.api;

/**
 * Does Java have support for multicore processors/parallel processing?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3330440">https://stackoverflow.com/a/3330440</a>
 */
public class APIzator3330440 {

  public static int haveSupport() throws Exception {
    return Runtime.getRuntime().availableProcessors();
  }
}
