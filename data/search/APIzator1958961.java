package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * What is Double Brace initialization in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1958961">https://stackoverflow.com/a/1958961</a>
 */
public class APIzator1958961 {

  public static void be() throws Exception {
    new ArrayList<Integer>() {
      {
        add(1);
        add(2);
      }
    };
  }
}
