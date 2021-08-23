package com.stackoverflow.api;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Why do I get an UnsupportedOperationException when trying to remove an element from a List?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2965808">https://stackoverflow.com/a/2965808</a>
 */
public class APIzator2965808 {

  public static List<String> getUnsupportedoperationexception(String split)
    throws Exception {
    return new LinkedList<String>(Arrays.asList(split));
  }
}
