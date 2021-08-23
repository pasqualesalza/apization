package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.Weeks;

/**
 * Get the number of weeks between two Dates.
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9963794">https://stackoverflow.com/a/9963794</a>
 */
public class APIzator9963794 {

  public static int getNumber(int date1, int date2) throws Exception {
    DateTime dateTime1 = new DateTime(date1);
    DateTime dateTime2 = new DateTime(date2);
    return Weeks.weeksBetween(dateTime1, dateTime2).getWeeks();
  }
}
