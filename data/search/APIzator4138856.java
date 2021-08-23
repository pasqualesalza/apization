package com.stackoverflow.api;

/**
 * Check string for palindrome
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4138856">https://stackoverflow.com/a/4138856</a>
 */
public class APIzator4138856 {

  public static boolean istPalindrom(char[] word) {
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) {
      if (word[i1] != word[i2]) {
        return false;
      }
      ++i1;
      --i2;
    }
    return true;
  }
}
