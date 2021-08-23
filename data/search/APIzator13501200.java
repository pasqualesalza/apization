package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java ArrayList - how can I tell if two lists are equal, order not mattering?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13501200">https://stackoverflow.com/a/13501200</a>
 */
public class APIzator13501200 {

  public static boolean equalLists(List<String> one, List<String> two) {
    if (one == null && two == null) {
      return true;
    }
    if (
      (one == null && two != null) ||
      one != null &&
      two == null ||
      one.size() != two.size()
    ) {
      return false;
    }
    // to avoid messing the order of the lists we will use a copy
    // as noted in comments by A. R. S.
    one = new ArrayList<String>(one);
    two = new ArrayList<String>(two);
    Collections.sort(one);
    Collections.sort(two);
    return one.equals(two);
  }
}
