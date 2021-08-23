package com.stackoverflow.api;

import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Convert comma separated string into a HashSet
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19003565">https://stackoverflow.com/a/19003565</a>
 */
public class APIzator19003565 {

  public static void separateString(String csv) throws Exception {
    // Or a more realistic size
    HashSet<String> myHashSet = new HashSet(500000);
    StringTokenizer st = new StringTokenizer(csv, ",");
    while (st.hasMoreTokens()) myHashSet.add(st.nextToken());
  }
}
