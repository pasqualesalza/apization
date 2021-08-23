package com.stackoverflow.api;

/**
 * Java: Getting a substring from a string starting after a particular character
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14316548">https://stackoverflow.com/a/14316548</a>
 */
public class APIzator14316548 {

  public static String java(String example) throws Exception {
    return example.substring(example.lastIndexOf("/") + 1);
  }
}
