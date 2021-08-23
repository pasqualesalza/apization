package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Get the index of a pattern in a string using regex
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8938549">https://stackoverflow.com/a/8938549</a>
 */
public class APIzator8938549 {

  public static void printMatches(String text, String regex) {
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    // Check all occurrences
    while (matcher.find()) {
      System.out.print("Start index: " + matcher.start());
      System.out.print(" End index: " + matcher.end());
      System.out.println(" Found: " + matcher.group());
    }
  }
}
