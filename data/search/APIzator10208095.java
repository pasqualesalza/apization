package com.stackoverflow.api;

import java.util.HashSet;
import java.util.Set;

/**
 * String.equals() with multiple conditions (and one action on result)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10208095">https://stackoverflow.com/a/10208095</a>
 */
public class APIzator10208095 {

  public static void stringequals(String some_string, Set<String> names)
    throws Exception {
    if (
      some_string.equals("john") ||
      some_string.equals("mary") ||
      some_string.equals("peter")
    ) {}
    if (some_string.matches("john|mary|peter")) {}
    if (names.contains(some_string)) {}
  }
}
