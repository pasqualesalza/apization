package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * adding days to a date
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1416913">https://stackoverflow.com/a/1416913</a>
 */
public class APIzator1416913 {

  public static Date addDay() throws Exception {
    Calendar c = new GregorianCalendar(2009, Calendar.JANUARY, 1);
    c.add(Calendar.DAY_OF_MONTH, 1);
    // Get a calendar which is set to a specified date.
    Calendar calendar = new GregorianCalendar(2009, Calendar.JANUARY, 1);
    // Get the current date representation of the calendar.
    Date startDate = calendar.getTime();
    // Increment the calendar's date by 1 day.
    calendar.add(Calendar.DAY_OF_MONTH, 1);
    // Get the current date representation of the calendar.
    Date endDate = calendar.getTime();
    System.out.println(startDate);
    return endDate;
  }
}
