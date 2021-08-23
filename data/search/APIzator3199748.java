package com.stackoverflow.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Java: how to convert a List<?> to a Map<String,?>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3199748">https://stackoverflow.com/a/3199748</a>
 */
public class APIzator3199748 {

  public static <T> Map<String, T> mapMe(Collection<T> list) {
    Map<String, T> map = new HashMap<String, T>();
    for (T el : list) {
      map.put(el.toString(), el);
    }
    return map;
  }
}
