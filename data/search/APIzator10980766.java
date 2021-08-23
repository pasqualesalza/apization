package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How to find elements in a collection by property?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10980766">https://stackoverflow.com/a/10980766</a>
 */
public class APIzator10980766 {

  public static List<String> findElement() throws Exception {
    List<String> mixedup = Arrays.asList(
      "A",
      "0",
      "B",
      "C",
      "1",
      "D",
      "F",
      "3"
    );
    List<String> numbersOnlyList = new ArrayList<>();
    for (String s : mixedup) {
      try {
        // here you could evaluate you property or field
        Integer.valueOf(s);
        numbersOnlyList.add(s);
      } catch (NumberFormatException ignored) {}
    }
    return numbersOnlyList;
  }
}
