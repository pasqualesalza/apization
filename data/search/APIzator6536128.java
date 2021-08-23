package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Java ArrayList copy
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6536128">https://stackoverflow.com/a/6536128</a>
 */
public class APIzator6536128 {

  public static List<Integer> copy(int oldList) throws Exception {
    return new ArrayList<>(oldList);
  }
}
