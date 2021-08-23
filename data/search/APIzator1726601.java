package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Why is Java's Double.compare(double, double) implemented the way it is?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1726601">https://stackoverflow.com/a/1726601</a>
 */
public class APIzator1726601 {

  public static void implementWay(List<Double> l, Map<Object, String> m)
    throws Exception {
    if (l.contains(Double.NaN)) {
      // this wont be executed.
    }
    if (m.get(Double.NaN) != null) {
      // this wont be executed.
    }
  }
}
