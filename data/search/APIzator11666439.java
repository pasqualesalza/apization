package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to get regex matched group values
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11666439">https://stackoverflow.com/a/11666439</a>
 */
public class APIzator11666439 {

  public static void getValue(String time, String timeRegex)
    throws Exception {
    Pattern pattern = Pattern.compile(timeRegex);
    Matcher matcher = pattern.matcher(time);
    if (matcher.matches()) {
      String hours = matcher.group(1);
      String minutes = matcher.group(2);
      String seconds = matcher.group(3);
      String miliSeconds = matcher.group(4);
      System.out.println(
        hours + ", " + minutes + ", " + seconds + ", " + miliSeconds
      );
    }
  }
}
