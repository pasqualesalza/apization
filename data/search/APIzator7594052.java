package com.stackoverflow.api;

/**
 * RegEx to split camelCase or TitleCase (advanced)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7594052">https://stackoverflow.com/a/7594052</a>
 */
public class APIzator7594052 {

  public static void advanced() {
    for (String w : "camelValue".split(
        "(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])"
      )) {
      System.out.println(w);
    }
  }
}
