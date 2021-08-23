package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Using Regular Expressions to Extract a Value in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/237068">https://stackoverflow.com/a/237068</a>
 */
public class APIzator237068 {

  private static final Pattern p = Pattern.compile("^([a-zA-Z]+)([0-9]+)(.*)");

  public static void useExpression() {
    // create matcher for pattern p and given string
    Matcher m = p.matcher("Testing123Testing");
    // if an occurrence if a pattern was found in a given string...
    if (m.find()) {
      // ...then you can use group() methods.
      // whole matched expression
      System.out.println(m.group(0));
      // first expression from round brackets (Testing)
      System.out.println(m.group(1));
      // second one (123)
      System.out.println(m.group(2));
      // third one (Testing)
      System.out.println(m.group(3));
    }
  }
}
