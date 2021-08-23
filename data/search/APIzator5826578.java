package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * Java : Iteration through a HashMap, which is more efficient?
 *
 * classpath: commons-lang3-3.8.1
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5826578">https://stackoverflow.com/a/5826578</a>
 */
public class APIzator5826578 {

  public static void java(int mapSize, int strLength) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    // populate map
    for (int i = 0; i < mapSize; i++) map.put(
      RandomStringUtils.random(strLength),
      RandomUtils.nextInt()
    );
    long start = System.currentTimeMillis();
    // alt. #1
    for (String key : map.keySet()) {
      Integer value = map.get(key);
      // use key and value
    }
    System.out.println(
      "Alt #1 took " + (System.currentTimeMillis() - start) + " ms"
    );
    start = System.currentTimeMillis();
    // alt. #2
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      // use key and value
    }
    System.out.println(
      "Alt #2 took " + (System.currentTimeMillis() - start) + " ms"
    );
  }
}
