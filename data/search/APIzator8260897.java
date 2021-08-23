package com.stackoverflow.api;

/**
 * What is the most elegant way to check if all values in a boolean array are true?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8260897">https://stackoverflow.com/a/8260897</a>
 */
public class APIzator8260897 {

  public static boolean areAllTrue(boolean[] array) {
    for (boolean b : array) if (!b) return false;
    return true;
  }
}
