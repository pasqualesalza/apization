package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * How can I check if two ArrayList differ, I don't care what's changed
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/41788514">https://stackoverflow.com/a/41788514</a>
 */
public class APIzator41788514 {

  // the name of the method explains it well...
  public static boolean isTwoArrayListsWithSameValues(
    ArrayList<Object> list1,
    ArrayList<Object> list2
  ) {
    // null checking
    if (list1 == null && list2 == null) return true;
    if (
      (list1 == null && list2 != null) || (list1 != null && list2 == null)
    ) return false;
    if (list1.size() != list2.size()) return false;
    for (Object itemList1 : list1) {
      if (!list2.contains(itemList1)) return false;
    }
    return true;
  }
}
