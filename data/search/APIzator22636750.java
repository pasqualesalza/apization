package com.stackoverflow.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * UnmodifiableMap (Java Collections) vs ImmutableMap (Google)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22636750">https://stackoverflow.com/a/22636750</a>
 */
public class APIzator22636750 {

  public static void unmodifiablemap(Map<String, String> realMap)
    throws Exception {
    Map<String, String> unmodifiableMap = Collections.unmodifiableMap(realMap);
    // This is not possible: It would throw an
    // UnsupportedOperationException
    // unmodifiableMap.put("C", "D");
    // This is still possible:
    realMap.put("E", "F");
    // The change in the "realMap" is now also visible
    // in the "unmodifiableMap". So the unmodifiableMap
    // has changed after it has been created.
    // Will return "F".
    unmodifiableMap.get("E");
    Map<String, String> immutableMap = Collections.unmodifiableMap(
      new LinkedHashMap<String, String>(realMap)
    );
  }
}
