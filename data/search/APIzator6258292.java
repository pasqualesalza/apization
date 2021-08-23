package com.stackoverflow.api;

/**
 * Java replace issues with ' (apostrophe/single quote) and \ (backslash) together
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6258292">https://stackoverflow.com/a/6258292</a>
 */
public class APIzator6258292 {

  public static void replaceIssue() throws Exception {
    "This is' it".replace("'", "\\'");
  }
}
