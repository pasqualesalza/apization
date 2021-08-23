package com.stackoverflow.api;

/**
 * Counting unique characters in a String given by the user
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22597559">https://stackoverflow.com/a/22597559</a>
 */
public class APIzator22597559 {

  public static int countUniqueCharacters(String input) {
    boolean[] isItThere = new boolean[Character.MAX_VALUE];
    for (int i = 0; i < input.length(); i++) {
      isItThere[input.charAt(i)] = true;
    }
    int count = 0;
    for (int i = 0; i < isItThere.length; i++) {
      if (isItThere[i] == true) {
        count++;
      }
    }
    return count;
  }
}
