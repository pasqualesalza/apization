package com.stackoverflow.api;

/**
 * How to find vowels in a string in java program
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19066796">https://stackoverflow.com/a/19066796</a>
 */
public class APIzator19066796 {

  public static void findVowel(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (
        (str.charAt(i) == 'a') ||
        (str.charAt(i) == 'e') ||
        (str.charAt(i) == 'i') ||
        (str.charAt(i) == 'o') ||
        (str.charAt(i) == 'u')
      ) {
        System.out.println(" The String contains " + str.charAt(i));
      }
    }
  }
}
