package com.stackoverflow.api;

/**
 * Converting a String that contains decimal to Long
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12732349">https://stackoverflow.com/a/12732349</a>
 */
public class APIzator12732349 {

  public static void convertString(long lDurationMillis)
    throws Exception {
    lDurationMillis = (long) Double.parseDouble("30000.1");
  }
}
