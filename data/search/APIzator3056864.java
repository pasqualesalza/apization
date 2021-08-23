package com.stackoverflow.api;

/**
 * replace \n and \r\n with <br /> in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3056864">https://stackoverflow.com/a/3056864</a>
 */
public class APIzator3056864 {

  public static String replaceN(String str) {
    str = str.replaceAll("(\r\n|\n)", "<br />");
    return str;
  }
}
