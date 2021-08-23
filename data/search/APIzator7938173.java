package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String Pattern Matching In Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7938173">https://stackoverflow.com/a/7938173</a>
 */
public class APIzator7938173 {

  public static void matching(String URL) throws Exception {
    Pattern pattern = Pattern.compile("/\\{\\w+\\}/");
    Matcher matcher = pattern.matcher(URL);
    if (matcher.find()) {
      // prints /{item}/
      System.out.println(matcher.group(0));
    } else {
      System.out.println("Match not found");
    }
  }
}
