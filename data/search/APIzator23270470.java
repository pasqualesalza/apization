package com.stackoverflow.api;

import java.util.Enumeration;
import java.util.function.Consumer;

/**
 * Iterate an Enumeration in Java 8
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23270470">https://stackoverflow.com/a/23270470</a>
 */
public class APIzator23270470 {

  public static <T> void forEachRemaining(
    Enumeration<T> e,
    Consumer<? super T> c
  ) {
    while (e.hasMoreElements()) c.accept(e.nextElement());
  }
}
