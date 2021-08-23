package com.stackoverflow.api;

/**
 * Greater than and less than in one statement
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4647059">https://stackoverflow.com/a/4647059</a>
 */
public class APIzator4647059 {

  public static boolean isBetween(int value, int min, int max) {
    return ((value > min) && (value < max));
  }
}
