package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Convert String array to ArrayList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10530379">https://stackoverflow.com/a/10530379</a>
 */
public class APIzator10530379 {

  public static void array(String[] words) {
    List<String> wordList = Arrays.asList(words);
    for (String e : wordList) {
      System.out.println(e);
    }
  }
}
