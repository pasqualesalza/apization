package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Comparator;

/**
 * how to sort a string alphabetically java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19468188">https://stackoverflow.com/a/19468188</a>
 */
public class APIzator19468188 {

  public static void sortJava(String str) throws Exception {
    // put the characters into an array
    Character[] chars = new Character[str.length()];
    // sort the array
    Arrays.sort(
      chars,
      new Comparator<Character>() {
        public int compare(Character c1, Character c2) {
          int cmp = Character.compare(
            Character.toLowerCase(c1.charValue()),
            Character.toLowerCase(c2.charValue())
          );
          if (cmp != 0) return cmp;
          return Character.compare(c1.charValue(), c2.charValue());
        }
      }
    );
    // rebuild the string
    StringBuilder sb = new StringBuilder(chars.length);
    for (char c : chars) sb.append(c);
    str = sb.toString();
  }
}
