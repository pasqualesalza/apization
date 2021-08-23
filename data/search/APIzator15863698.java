package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * How to initialize a vector with an array in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15863698">https://stackoverflow.com/a/15863698</a>
 */
public class APIzator15863698 {

  public static List<String> initializeVector(String array)
    throws Exception {
    Vector<String> vector = new Vector<String>(Arrays.asList(array));
    return new ArrayList<>(Arrays.asList(array));
  }
}
