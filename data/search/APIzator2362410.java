package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Error about invalid XML characters on Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2362410">https://stackoverflow.com/a/2362410</a>
 */
public class APIzator2362410 {

  public static void error(
    String dirtyXMLString,
    Pattern pattern,
    Matcher matcher
  ) throws Exception {
    String cleanXMLString = null;
    pattern = Pattern.compile("[\\000]*");
    matcher = pattern.matcher(dirtyXMLString);
    if (matcher.find()) {
      cleanXMLString = matcher.replaceAll("");
    }
  }
}
