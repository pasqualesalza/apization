package com.stackoverflow.api;

import java.util.HashSet;
import java.util.List;

/**
 * Simple way to find if two different lists contain exactly the same elements?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1075699">https://stackoverflow.com/a/1075699</a>
 */
public class APIzator1075699 {

  public static <T> boolean listEqualsIgnoreOrder(
    List<T> list1,
    List<T> list2
  ) {
    return new HashSet<>(list1).equals(new HashSet<>(list2));
  }
}
