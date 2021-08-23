package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern to extract text between parenthesis
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24256509">https://stackoverflow.com/a/24256509</a>
 */
public class APIzator24256509 {

  public static String pattern(String x, String str) throws Exception {
    Matcher m = Pattern.compile("\\((.*?)\\)").matcher(x);
    while (m.find()) {
      System.out.println(m.group(1));
    }
    return str.substring(str.indexOf("(") + 1, str.indexOf(")"));
  }
}
