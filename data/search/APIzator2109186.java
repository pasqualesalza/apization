package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to get first day of a given week number in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2109186">https://stackoverflow.com/a/2109186</a>
 */
public class APIzator2109186 {

  public static Date getDay(int week, int year) throws Exception {
    // Get calendar, clear it and set week number and year.
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.WEEK_OF_YEAR, week);
    calendar.set(Calendar.YEAR, year);
    return calendar.getTime();
  }
}
