package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * java regular expression to extract content within square brackets
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4006273">https://stackoverflow.com/a/4006273</a>
 */
public class APIzator4006273 {

  public static void expression(String in) throws Exception {
    Pattern p = Pattern.compile("\\[(.*?)\\]");
    Matcher m = p.matcher(in);
    while (m.find()) {
      System.out.println(m.group(1));
    }
  }
}
