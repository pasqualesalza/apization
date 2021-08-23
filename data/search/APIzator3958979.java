package com.stackoverflow.api;

/**
 * How to remove duplicate white spaces in string using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3958979">https://stackoverflow.com/a/3958979</a>
 */
public class APIzator3958979 {

  public static String removeSpace(String yourString) throws Exception {
    yourString = yourString.replaceAll("\\s+", " ");
    return "lorem  ipsum   dolor \n sit.".replaceAll("\\s+", " ");
  }
}
