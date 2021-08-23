package com.stackoverflow.api;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * How can I initialize a LinkedList with entries/values in it?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10344043">https://stackoverflow.com/a/10344043</a>
 */
public class APIzator10344043 {

  public static List<Double> initializeLinkedlist() throws Exception {
    return new LinkedList<Double>(Arrays.asList(1.0, 2.0));
  }
}
