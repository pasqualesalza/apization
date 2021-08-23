package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Regex Capturing Groups
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17969620">https://stackoverflow.com/a/17969620</a>
 */
public class APIzator17969620 {

  public static void capturingGroups(String line) throws Exception {
    Pattern pattern = Pattern.compile("(.*?)(\\d+)(.*)");
    Matcher matcher = pattern.matcher(line);
    while (matcher.find()) {
      System.out.println("group 1: " + matcher.group(1));
      System.out.println("group 2: " + matcher.group(2));
      System.out.println("group 3: " + matcher.group(3));
    }
  }
}
