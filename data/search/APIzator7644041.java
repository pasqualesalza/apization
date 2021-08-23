package com.stackoverflow.api;

/**
 * How to remove white space characters in between the string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7644041">https://stackoverflow.com/a/7644041</a>
 */
public class APIzator7644041 {

  public static String removeCharacter(String inputText)
    throws Exception {
    return inputText.replaceAll("\\s+", "");
  }
}
