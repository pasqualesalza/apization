package com.stackoverflow.api;

import java.util.regex.*;

/**
 * How can i get inside parentheses value in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14584318">https://stackoverflow.com/a/14584318</a>
 */
public class APIzator14584318 {

  public static void get(String example) {
    Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(example);
    while (m.find()) {
      System.out.println(m.group(1));
    }
  }
}
