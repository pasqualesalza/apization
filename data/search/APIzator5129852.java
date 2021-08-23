package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.Date;

/**
 * Increment existing date by 1 day
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5129852">https://stackoverflow.com/a/5129852</a>
 */
public class APIzator5129852 {

  public static Date date(Date yourdate) throws Exception {
    Calendar c = Calendar.getInstance();
    c.setTime(yourdate);
    c.add(Calendar.DATE, 1);
    return c.getTime();
  }
}
