package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to remove leading and trailing whitespace from the string in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9108806">https://stackoverflow.com/a/9108806</a>
 */
public class APIzator9108806 {

  public static String remove(String s) throws Exception {
    Pattern trimmer = Pattern.compile("^\\s+|\\s+$");
    Matcher m = trimmer.matcher(s);
    StringBuffer out = new StringBuffer();
    while (m.find()) m.appendReplacement(out, "");
    m.appendTail(out);
    return out + "!";
  }
}
