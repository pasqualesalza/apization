package com.stackoverflow.api;

/**
 * How to replace " \ " with " \\ " in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7535326">https://stackoverflow.com/a/7535326</a>
 */
public class APIzator7535326 {

  public static String replace(String original) throws Exception {
    return original.replace("\\", "\\\\");
  }
}
