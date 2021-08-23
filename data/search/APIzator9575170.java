package com.stackoverflow.api;

import java.util.regex.Matcher;

/**
 * Forward slash in Java Regex
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9575170">https://stackoverflow.com/a/9575170</a>
 */
public class APIzator9575170 {

  public static void slash() throws Exception {
    "Hello/You/There".replaceAll("/", "\\\\/");
    "Hello/You/There".replaceAll("/", Matcher.quoteReplacement("\\/"));
  }
}
