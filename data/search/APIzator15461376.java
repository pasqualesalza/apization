package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Best way to convert Milliseconds to number of years, months and days
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15461376">https://stackoverflow.com/a/15461376</a>
 */
public class APIzator15461376 {

  public static int way(int milliseconds) throws Exception {
    Calendar c = Calendar.getInstance();
    // Set time in milliseconds
    c.setTimeInMillis(milliseconds);
    int mYear = c.get(Calendar.YEAR);
    int mMonth = c.get(Calendar.MONTH);
    int mDay = c.get(Calendar.DAY_OF_MONTH);
    int hr = c.get(Calendar.HOUR);
    int min = c.get(Calendar.MINUTE);
    return c.get(Calendar.SECOND);
  }
}
