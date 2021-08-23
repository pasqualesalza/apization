package com.stackoverflow.api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * What is the point of the diamond operator in Java 7?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4167148">https://stackoverflow.com/a/4167148</a>
 */
public class APIzator4167148 {

  public static List<Integer> be(Collection strings) throws Exception {
    List<String> list = new LinkedList();
    return new LinkedList<>(strings);
  }
}
