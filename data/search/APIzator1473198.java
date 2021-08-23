package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * how to get data between quotes in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1473198">https://stackoverflow.com/a/1473198</a>
 */
public class APIzator1473198 {

  public static void getDatum(String line) throws Exception {
    Pattern p = Pattern.compile("\"([^\"]*)\"");
    Matcher m = p.matcher(line);
    while (m.find()) {
      System.out.println(m.group(1));
    }
  }
}
