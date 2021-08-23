package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extract string between two strings in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16597374">https://stackoverflow.com/a/16597374</a>
 */
public class APIzator16597374 {

  public static void string(String str) throws Exception {
    Pattern pattern = Pattern.compile("<%=(.*?)%>");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  }
}
