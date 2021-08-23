package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * How to get start and end date of a year?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9383062">https://stackoverflow.com/a/9383062</a>
 */
public class APIzator9383062 {

  public static void getStart() throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, 2014);
    cal.set(Calendar.DAY_OF_YEAR, 1);
    Date start = cal.getTime();
    // set date to last day of 2014
    cal.set(Calendar.YEAR, 2014);
    // 11 = december
    cal.set(Calendar.MONTH, 11);
    // new years eve
    cal.set(Calendar.DAY_OF_MONTH, 31);
    Date end = cal.getTime();
    // Iterate through the two dates
    GregorianCalendar gcal = new GregorianCalendar();
    gcal.setTime(start);
    while (gcal.getTime().before(end)) {
      gcal.add(Calendar.DAY_OF_YEAR, 1);
      // Do Something ...
    }
  }
}
