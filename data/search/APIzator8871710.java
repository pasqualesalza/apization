package com.stackoverflow.api;

/**
 * how to find before and after sub-string in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8871710">https://stackoverflow.com/a/8871710</a>
 */
public class APIzator8871710 {

  public static String find(String s) throws Exception {
    String[] split = s.split("dance");
    String firstSubString = split[0];
    return split[1];
  }
}
