package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Get difference between two dates in months using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16559066">https://stackoverflow.com/a/16559066</a>
 */
public class APIzator16559066 {

  public static int getDifference(Date startDate, Date endDate)
    throws Exception {
    Calendar startCalendar = new GregorianCalendar();
    startCalendar.setTime(startDate);
    Calendar endCalendar = new GregorianCalendar();
    endCalendar.setTime(endDate);
    int diffYear =
      endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
    return (
      diffYear *
      12 +
      endCalendar.get(Calendar.MONTH) -
      startCalendar.get(Calendar.MONTH)
    );
  }
}
