package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Splitting a string into 2 strings based on a delimiter.
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7631872">https://stackoverflow.com/a/7631872</a>
 */
public class APIzator7631872 {

  public static void splittingString(
    String inputString,
    String string2,
    String string1
  ) throws Exception {
    Pattern pattern = Pattern.compile(", *");
    Matcher matcher = pattern.matcher(inputString);
    if (matcher.find()) {
      string1 = inputString.substring(0, matcher.start());
      string2 = inputString.substring(matcher.end());
    }
  }
}
