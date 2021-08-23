package com.stackoverflow.api;

import java.util.Calendar;

/**
 * How to convert currentTimeMillis to a date in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/24182811">https://stackoverflow.com/a/24182811</a>
 */
public class APIzator24182811 {

  public static int convertCurrenttimemillis(int timeStamp)
    throws Exception {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(timeStamp);
    int mYear = calendar.get(Calendar.YEAR);
    int mMonth = calendar.get(Calendar.MONTH);
    return calendar.get(Calendar.DAY_OF_MONTH);
  }
}
