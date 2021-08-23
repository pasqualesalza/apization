package com.stackoverflow.api;

/**
 * Tokenizing Error: java.util.regex.PatternSyntaxException, dangling metacharacter '*'
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/917840">https://stackoverflow.com/a/917840</a>
 */
public class APIzator917840 {

  public static String[] error(String line) throws Exception {
    return line.split("\\*");
  }
}
