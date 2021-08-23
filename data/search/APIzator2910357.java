package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Length of the String without using length() method
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2910357">https://stackoverflow.com/a/2910357</a>
 */
public class APIzator2910357 {

  public static int length(String str) throws Exception {
    Matcher m = Pattern.compile("$").matcher(str);
    m.find();
    return m.end();
  }
}
