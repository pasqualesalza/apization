package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to match repeated patterns?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4739777">https://stackoverflow.com/a/4739777</a>
 */
public class APIzator4739777 {

  public static void matchPattern(String text) {
    Pattern p = Pattern.compile("\\w+(\\.\\w+)+");
    Matcher m = p.matcher(text);
    while (m.find()) {
      System.out.println(m.group());
    }
  }
}
