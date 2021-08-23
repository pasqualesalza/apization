package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * store current date and date 1 year from current in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14946917">https://stackoverflow.com/a/14946917</a>
 */
public class APIzator14946917 {

  public static Date storeDate() throws Exception {
    Calendar cal = Calendar.getInstance();
    Date today = cal.getTime();
    // to get previous year add -1
    cal.add(Calendar.YEAR, 1);
    return cal.getTime();
  }
}
