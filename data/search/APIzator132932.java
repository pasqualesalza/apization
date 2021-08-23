package com.stackoverflow.api;

/**
 * Servlet for serving static content
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/132932">https://stackoverflow.com/a/132932</a>
 */
public class APIzator132932 {

  public static <T> T coalesce(T... ts) {
    for (T t : ts) if (t != null) return t;
    return null;
  }
}
