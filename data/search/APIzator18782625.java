package com.stackoverflow.api;

/**
 * Reversing the Sentence in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18782625">https://stackoverflow.com/a/18782625</a>
 */
public class APIzator18782625 {

  public static String reverseSentence(String s) throws Exception {
    String[] split = s.split(" ");
    String result = "";
    for (int i = split.length - 1; i >= 0; i--) {
      result += (split[i] + " ");
    }
    return result.trim();
  }
}
