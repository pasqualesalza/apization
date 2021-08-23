package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Find out Last 30 Days, 60 Days and 90 Days in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/979478">https://stackoverflow.com/a/979478</a>
 */
public class APIzator979478 {

  public static Date find() throws Exception {
    Date today = new Date();
    Calendar cal = new GregorianCalendar();
    cal.setTime(today);
    cal.add(Calendar.DAY_OF_MONTH, -30);
    Date today30 = cal.getTime();
    cal.add(Calendar.DAY_OF_MONTH, -60);
    Date today60 = cal.getTime();
    cal.add(Calendar.DAY_OF_MONTH, -90);
    return cal.getTime();
  }
}
