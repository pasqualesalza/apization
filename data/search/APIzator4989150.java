package com.stackoverflow.api;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Removing duplicates from a String in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4989150">https://stackoverflow.com/a/4989150</a>
 */
public class APIzator4989150 {

  public static String removeDuplicate(String string) throws Exception {
    char[] chars = string.toCharArray();
    Set<Character> charSet = new LinkedHashSet<Character>();
    for (char c : chars) {
      charSet.add(c);
    }
    StringBuilder sb = new StringBuilder();
    for (Character character : charSet) {
      sb.append(character);
    }
    return sb.toString();
  }
}
