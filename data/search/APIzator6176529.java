package com.stackoverflow.api;

/**
 * How to use assert in android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6176529">https://stackoverflow.com/a/6176529</a>
 */
public class APIzator6176529 {

  public static void useAssert(String obj) throws Exception {
    if (obj == null) throw new AssertionError("Object cannot be null");
  }
}
