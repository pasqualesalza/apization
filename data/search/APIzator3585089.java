package com.stackoverflow.api;

import avro.shaded.com.google.common.base.CharMatcher;

/**
 * In Java, is it possible to check if a String is only ASCII?
 *
 * classpath: avro-1.8.2
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3585089">https://stackoverflow.com/a/3585089</a>
 */
public class APIzator3585089 {

  public static boolean be(String someString) throws Exception {
    return CharMatcher.ASCII.matchesAllOf(someString);
  }
}
