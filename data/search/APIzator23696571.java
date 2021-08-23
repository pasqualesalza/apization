package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;

/**
 * Find first element by predicate
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23696571">https://stackoverflow.com/a/23696571</a>
 */
public class APIzator23696571 {

  public static int findElement() throws Exception {
    List<Integer> list = Arrays.asList(1, 10, 3, 7, 5);
    int a = list
      .stream()
      .peek(num -> System.out.println("will filter " + num))
      .filter(x -> x > 5)
      .findFirst()
      .get();
    return a;
  }
}
