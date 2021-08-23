package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Java: How to split a string by a number of characters?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9276720">https://stackoverflow.com/a/9276720</a>
 */
public class APIzator9276720 {

  public static void java(String text) throws Exception {
    List<String> strings = new ArrayList<String>();
    int index = 0;
    while (index < text.length()) {
      strings.add(text.substring(index, Math.min(index + 4, text.length())));
      index += 4;
    }
  }
}
