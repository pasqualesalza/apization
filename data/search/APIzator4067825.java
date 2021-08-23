package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How can I find whitespace space in a String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4067825">https://stackoverflow.com/a/4067825</a>
 */
public class APIzator4067825 {

  public static boolean findSpace(String s) throws Exception {
    Pattern pattern = Pattern.compile("\\s");
    Matcher matcher = pattern.matcher(s);
    boolean found = matcher.find();
    return s.matches("^\\s*$");
  }
}
