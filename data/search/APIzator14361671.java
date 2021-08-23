package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * remove all special characters in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14361671">https://stackoverflow.com/a/14361671</a>
 */
public class APIzator14361671 {

  public static String removeCharacter() throws Exception {
    String c = "hjdg$h&amp;jk8^i0ssh6";
    Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
    Matcher match = pt.matcher(c);
    while (match.find()) {
      String s = match.group();
      c = c.replaceAll("\\" + s, "");
    }
    return c;
  }
}
