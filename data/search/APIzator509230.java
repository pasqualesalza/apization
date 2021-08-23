package com.stackoverflow.api;

import java.util.HashMap;

/**
 * How do I address unchecked cast warnings?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/509230">https://stackoverflow.com/a/509230</a>
 */
public class APIzator509230 {

  public static <K, V> HashMap<K, V> castHash(
    HashMap input,
    Class<K> keyClass,
    Class<V> valueClass
  ) {
    HashMap<K, V> output = new HashMap<K, V>();
    if (input == null) return output;
    for (Object key : input.keySet().toArray()) {
      if ((key == null) || (keyClass.isAssignableFrom(key.getClass()))) {
        Object value = input.get(key);
        if (
          (value == null) || (valueClass.isAssignableFrom(value.getClass()))
        ) {
          K k = keyClass.cast(key);
          V v = valueClass.cast(value);
          output.put(k, v);
        } else {
          throw new AssertionError(
            "Cannot cast to HashMap<" +
            keyClass.getSimpleName() +
            ", " +
            valueClass.getSimpleName() +
            ">" +
            ", value " +
            value +
            " is not a " +
            valueClass.getSimpleName()
          );
        }
      } else {
        throw new AssertionError(
          "Cannot cast to HashMap<" +
          keyClass.getSimpleName() +
          ", " +
          valueClass.getSimpleName() +
          ">" +
          ", key " +
          key +
          " is not a " +
          keyClass.getSimpleName()
        );
      }
    }
    return output;
  }
}
