package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * How to Convert List<String> to List<Object>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4288124">https://stackoverflow.com/a/4288124</a>
 */
public class APIzator4288124 {

  public static List<Object> convertList(int stringList)
    throws Exception {
    return new ArrayList<Object>(stringList);
  }
}
