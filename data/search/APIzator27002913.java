package com.stackoverflow.api;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * returning difference between two lists in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27002913">https://stackoverflow.com/a/27002913</a>
 */
public class APIzator27002913 {

  public static void returnDifference(int b, int a) throws Exception {
    Set<Date> ad = new HashSet<Date>(a);
    Set<Date> bd = new HashSet<Date>(b);
    ad.removeAll(bd);
  }
}
