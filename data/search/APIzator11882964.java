package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Date;

/**
 * How to subtract X day from a Date object in Java?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11882964">https://stackoverflow.com/a/11882964</a>
 */
public class APIzator11882964 {

  public static Date subtractDay(Date dateInstance) throws Exception {
    LocalDate date = LocalDate.now().minusDays(300);
    Calendar cal = Calendar.getInstance();
    cal.setTime(dateInstance);
    cal.add(Calendar.DATE, -30);
    return cal.getTime();
  }
}
