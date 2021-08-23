package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * Resetting the time part of a timestamp in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/227049">https://stackoverflow.com/a/227049</a>
 */
public class APIzator227049 {

  public static Date resetPart() throws Exception {
    // timestamp now
    Date date = new Date();
    // get calendar instance
    Calendar cal = Calendar.getInstance();
    // set cal to date
    cal.setTime(date);
    // set hour to midnight
    cal.set(Calendar.HOUR_OF_DAY, 0);
    // set minute in hour
    cal.set(Calendar.MINUTE, 0);
    // set second in minute
    cal.set(Calendar.SECOND, 0);
    // set millis in second
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
  }
}
