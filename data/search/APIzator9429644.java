package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Date and time conversion to some other Timezone in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9429644">https://stackoverflow.com/a/9429644</a>
 */
public class APIzator9429644 {

  public static Date date() throws Exception {
    Calendar calendar = Calendar.getInstance();
    TimeZone fromTimeZone = calendar.getTimeZone();
    TimeZone toTimeZone = TimeZone.getTimeZone("CST");
    calendar.setTimeZone(fromTimeZone);
    calendar.add(Calendar.MILLISECOND, fromTimeZone.getRawOffset() * -1);
    if (fromTimeZone.inDaylightTime(calendar.getTime())) {
      calendar.add(
        Calendar.MILLISECOND,
        calendar.getTimeZone().getDSTSavings() * -1
      );
    }
    calendar.add(Calendar.MILLISECOND, toTimeZone.getRawOffset());
    if (toTimeZone.inDaylightTime(calendar.getTime())) {
      calendar.add(Calendar.MILLISECOND, toTimeZone.getDSTSavings());
    }
    return calendar.getTime();
  }
}
