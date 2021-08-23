package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;

/**
 * Java char Array - deleting elements
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11425139">https://stackoverflow.com/a/11425139</a>
 */
public class APIzator11425139 {

  public static List<Character> char_(char[] array1) throws Exception {
    char[] array2 = Arrays.copyOfRange(array1, 0, 3);
    List<Character> list1 = Arrays.asList('h', 'm', 'l', 'e', 'l', 'l');
    return list1.subList(0, 3);
  }
}
