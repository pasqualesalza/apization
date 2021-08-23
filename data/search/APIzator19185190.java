package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How can I initialize a collection and add data on the same line?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19185190">https://stackoverflow.com/a/19185190</a>
 */
public class APIzator19185190 {

  public static void initializeCollection() throws Exception {
    List<String> numbers = Arrays.asList("one", "two", "three");
    // Can't add since the list is immutable
    // java.lang.UnsupportedOperationException
    numbers.add("four");
    List<String> numbers2 = new ArrayList<String>(
      Arrays.asList("one", "two", "three")
    );
    numbers2.add("four");
    // [one, two, three, four]
    System.out.println(numbers2);
  }
}
