package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex to get first number in string: 100 2011-10-20 14:28:55
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7854216">https://stackoverflow.com/a/7854216</a>
 */
public class APIzator7854216 {

  public static void regex(String s) throws Exception {
    Pattern p = Pattern.compile("(^|\\s)([0-9]+)($|\\s)");
    Matcher m = p.matcher(s);
    if (m.find()) {
      System.out.println(m.group(2));
    }
  }
}
