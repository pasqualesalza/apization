package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to extract numbers from a string and get an array of ints?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2367418">https://stackoverflow.com/a/2367418</a>
 */
public class APIzator2367418 {

  public static void extractNumber() throws Exception {
    Pattern p = Pattern.compile("-?\\d+");
    Matcher m = p.matcher(
      "There are more than -2 and less than 12 numbers here"
    );
    while (m.find()) {
      System.out.println(m.group());
    }
  }
}
