package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.Days;

/**
 * How do you subtract Dates in Java?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3526511">https://stackoverflow.com/a/3526511</a>
 */
public class APIzator3526511 {

  public static int subtractDate() throws Exception {
    DateTime dt1 = new DateTime(2000, 1, 1, 0, 0, 0, 0);
    DateTime dt2 = new DateTime(2010, 1, 1, 0, 0, 0, 0);
    return Days.daysBetween(dt1, dt2).getDays();
  }
}
