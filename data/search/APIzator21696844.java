package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * How to declare an ArrayList with values?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21696844">https://stackoverflow.com/a/21696844</a>
 */
public class APIzator21696844 {

  public static void declareArraylist() throws Exception {
    List<String> x = new ArrayList<>(Arrays.asList("xyz", "abc"));
    Stream.of("xyz", "abc").collect(Collectors.toList());
  }
}
