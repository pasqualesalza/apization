package com.stackoverflow.api;

/**
 * Generating all permutations of a given string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4240323">https://stackoverflow.com/a/4240323</a>
 */
public class APIzator4240323 {

  public static void permutation(String str) {
    permutation("", str);
  }

  private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix); else {
      for (int i = 0; i < n; i++) permutation(
        prefix + str.charAt(i),
        str.substring(0, i) + str.substring(i + 1, n)
      );
    }
  }
}
