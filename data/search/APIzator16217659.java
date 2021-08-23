package com.stackoverflow.api;

/**
 * String.split() at a meta character +
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16217659">https://stackoverflow.com/a/16217659</a>
 */
public class APIzator16217659 {

  public static void stringsplit(String rightside) throws Exception {
    rightside = rightside.replaceAll("\\+", " +");
    rightside = rightside.replaceAll("[+]", " +");
    rightside = rightside.replace("+", " +");
  }
}
