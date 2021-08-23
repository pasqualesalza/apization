package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to extract a substring using regex
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4662265">https://stackoverflow.com/a/4662265</a>
 */
public class APIzator4662265 {

  public static void extractSubstring(String mydata) throws Exception {
    Pattern pattern = Pattern.compile("'(.*?)'");
    Matcher matcher = pattern.matcher(mydata);
    if (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  }
}
