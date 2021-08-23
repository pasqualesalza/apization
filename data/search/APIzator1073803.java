package com.stackoverflow.api;

/**
 * print spaces with String.format()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1073803">https://stackoverflow.com/a/1073803</a>
 */
public class APIzator1073803 {

  public static void space(int numberOfSpaces) throws Exception {
    String.format("%" + numberOfSpaces + "s", "");
    String.format("%" + numberOfSpaces + "s", "Hello");
  }
}
