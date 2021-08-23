package com.stackoverflow.api;

import java.lang.reflect.Array;

/**
 * What is more efficient: System.arraycopy vs Arrays.copyOf?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2589797">https://stackoverflow.com/a/2589797</a>
 */
public class APIzator2589797 {

  public static <T, U> T[] copyOf(
    U[] original,
    int newLength,
    Class<? extends T[]> newType
  ) {
    T[] copy = ((Object) newType == (Object) Object[].class)
      ? (T[]) new Object[newLength]
      : (T[]) Array.newInstance(newType.getComponentType(), newLength);
    System.arraycopy(
      original,
      0,
      copy,
      0,
      Math.min(original.length, newLength)
    );
    return copy;
  }
}
