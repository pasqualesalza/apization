package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Most concise way to convert a Set<String> to a List<String>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2319555">https://stackoverflow.com/a/2319555</a>
 */
public class APIzator2319555 {

  public static List<String> way(int listOfTopicAuthors)
    throws Exception {
    return new ArrayList<String>(listOfTopicAuthors);
  }
}
