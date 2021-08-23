package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * How to find the exact word using a regex in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9464309">https://stackoverflow.com/a/9464309</a>
 */
public class APIzator9464309 {

  public static String findWord() throws Exception {
    Pattern p = Pattern.compile("\\bthis\\b");
    Matcher m = p.matcher("Print this");
    m.find();
    return m.group();
  }
}
