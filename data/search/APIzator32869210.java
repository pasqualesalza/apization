package com.stackoverflow.api;

import static java.lang.Math.toIntExact;

/**
 * Safely casting long to int in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/32869210">https://stackoverflow.com/a/32869210</a>
 */
public class APIzator32869210 {

  public static int cast(long foo) throws Exception {
    return toIntExact(foo);
  }
}
