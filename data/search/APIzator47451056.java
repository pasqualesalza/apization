package com.stackoverflow.api;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Java: String - add character n-times
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/47451056">https://stackoverflow.com/a/47451056</a>
 */
public class APIzator47451056 {

  public static String java(String s, int n) throws Exception {
    return IntStream
      .range(0, n)
      .mapToObj(i -> s)
      .collect(Collectors.joining(""));
  }
}
