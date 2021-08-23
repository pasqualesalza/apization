package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Can I replace groups in Java regex?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/988778">https://stackoverflow.com/a/988778</a>
 */
public class APIzator988778 {

  public static void replaceGroup(String input) throws Exception {
    Pattern p = Pattern.compile("(\\d)(.*)(\\d)");
    Matcher m = p.matcher(input);
    if (m.find()) {
      // replace first number with "number" and second number with the first
      // number 46
      String output = m.replaceFirst("number $3$1");
    }
  }
}
