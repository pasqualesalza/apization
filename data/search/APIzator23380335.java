package com.stackoverflow.api;

/**
 * How to check if a word is present in a sentence using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23380335">https://stackoverflow.com/a/23380335</a>
 */
public class APIzator23380335 {

  public static boolean check(String s) throws Exception {
    return s.matches(".*\\bram\\b.*");
  }
}
