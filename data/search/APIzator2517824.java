package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.Date;

/**
 * Comparing two java.util.Dates to see if they are in the same day
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2517824">https://stackoverflow.com/a/2517824</a>
 */
public class APIzator2517824 {

  public static boolean compareJavautil(Date date1, Date date2)
    throws Exception {
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    cal1.setTime(date1);
    cal2.setTime(date2);
    return (
      cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
      cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
    );
  }
}
