package com.stackoverflow.api;

/**
 * Java: Simplest way to get last word in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4672842">https://stackoverflow.com/a/4672842</a>
 */
public class APIzator4672842 {

  public static String java(String test) throws Exception {
    return test.substring(test.lastIndexOf(" ") + 1);
  }
}
