package com.stackoverflow.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Easy, simple to use LRU cache in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/224886">https://stackoverflow.com/a/224886</a>
 */
public class APIzator224886 {

  public static void useCache(int object, int MAX_ENTRIES, Object key)
    throws Exception {
    Map cache = new LinkedHashMap(MAX_ENTRIES + 1, .75F, true) {
      // This method is called just after a new entry has been added
      public boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
      }
    };
    cache.put(key, object);
    // Get object
    Object o = cache.get(key);
    if (o == null && !cache.containsKey(key)) {
      // Object not in cache. If null is not a possible value in the cache,
      // the call to cache.contains(key) is not needed
    }
    // If the cache is to be used by multiple threads,
    // the cache must be wrapped with code to synchronize the methods
    cache = (Map) Collections.synchronizedMap(cache);
  }
}
