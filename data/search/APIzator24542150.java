package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * How to debug stream().map(...) with lambda expressions?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24542150">https://stackoverflow.com/a/24542150</a>
 */
public class APIzator24542150 {

  public static void with() throws Exception {
    List<Integer> naturals = Arrays.asList(
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      11,
      12,
      13
    );
    naturals
      .stream()
      .map(n -> n * 2)
      .peek(System.out::println)
      .collect(Collectors.toList());
  }
}
