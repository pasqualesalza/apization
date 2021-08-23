package com.stackoverflow.api;

/**
 * Concatenating elements in an array to a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14958038">https://stackoverflow.com/a/14958038</a>
 */
public class APIzator14958038 {

  public static String element(String[] strArr) throws Exception {
    StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < strArr.length; i++) {
      strBuilder.append(strArr[i]);
    }
    return strBuilder.toString();
  }
}
