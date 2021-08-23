package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex to find special characters in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12586471">https://stackoverflow.com/a/12586471</a>
 */
public class APIzator12586471 {

  public static void regex() throws Exception {
    Pattern regex = Pattern.compile("[$&amp;+,:;=?@#|]");
    Matcher matcher = regex.matcher("123=456");
    if (matcher.find()) {
      // Do something
    }
  }
}
