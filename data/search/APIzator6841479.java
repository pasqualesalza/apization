package com.stackoverflow.api;

import java.util.TimeZone;

/**
 * Why is subtracting these two times (in 1927) giving a strange result?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6841479">https://stackoverflow.com/a/6841479</a>
 */
public class APIzator6841479 {

  public static void subtract(long startOf1900Utc) throws Exception {
    for (String id : TimeZone.getAvailableIDs()) {
      TimeZone zone = TimeZone.getTimeZone(id);
      if (zone.getRawOffset() != zone.getOffset(startOf1900Utc - 1)) {
        System.out.println(id);
      }
    }
  }
}
