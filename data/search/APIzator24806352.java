package com.stackoverflow.api;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Get date in current timezone in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24806352">https://stackoverflow.com/a/24806352</a>
 */
public class APIzator24806352 {

  public static String getDate() throws Exception {
    Calendar cal = Calendar.getInstance();
    long milliDiff = cal.get(Calendar.ZONE_OFFSET);
    // Got local offset, now loop through available timezone id(s).
    String[] ids = TimeZone.getAvailableIDs();
    String name = null;
    for (String id : ids) {
      TimeZone tz = TimeZone.getTimeZone(id);
      if (tz.getRawOffset() == milliDiff) {
        // Found a match.
        name = id;
        break;
      }
    }
    return name;
  }
}
