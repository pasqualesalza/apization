package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Can Java String.indexOf() handle a regular expression as a parameter?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4194331">https://stackoverflow.com/a/4194331</a>
 */
public class APIzator4194331 {

  public static void handleExpression(CharSequence inputStr, String patternStr)
    throws Exception {
    Pattern pattern = Pattern.compile(patternStr);
    Matcher matcher = pattern.matcher(inputStr);
    if (matcher.find()) {
      // this will give you index
      System.out.println(matcher.start());
    }
  }
}
