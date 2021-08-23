package com.stackoverflow.api;

/**
 * How to split a string between letters and digits (or between digits and letters)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8270824">https://stackoverflow.com/a/8270824</a>
 */
public class APIzator8270824 {

  public static void splitString(String str) throws Exception {
    str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
  }
}
