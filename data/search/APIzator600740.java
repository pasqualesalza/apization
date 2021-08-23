package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Using Java to find substring of a bigger string using Regular Expression
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/600740">https://stackoverflow.com/a/600740</a>
 */
public class APIzator600740 {

  public static void useJava() throws Exception {
    Pattern MY_PATTERN = Pattern.compile("\\[(.*?)\\]");
    Matcher m = MY_PATTERN.matcher("FOO[BAR]");
    while (m.find()) {
      String s = m.group(1);
      // s now contains "BAR"
    }
  }
}
