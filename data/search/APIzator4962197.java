package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java- Extract part of a string between two special characters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4962197">https://stackoverflow.com/a/4962197</a>
 */
public class APIzator4962197 {

  public static void extractPart(String str) throws Exception {
    Pattern pattern = Pattern.compile("'(.*?)\"");
    Matcher matcher = pattern.matcher(str);
    if (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  }
}
