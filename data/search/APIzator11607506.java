package com.stackoverflow.api;

/**
 * Trim a string in java to get first word
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11607506">https://stackoverflow.com/a/11607506</a>
 */
public class APIzator11607506 {

  public static void trimString() throws Exception {
    String firstWord = "Magic Word";
    if (firstWord.contains(" ")) {
      firstWord = firstWord.substring(0, firstWord.indexOf(" "));
      System.out.println(firstWord);
    }
  }
}
