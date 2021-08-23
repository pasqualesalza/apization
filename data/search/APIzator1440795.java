package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.Period;
import com.google.appengine.repackaged.org.joda.time.format.PeriodFormatter;
import com.google.appengine.repackaged.org.joda.time.format.PeriodFormatterBuilder;

/**
 * Period to string
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1440795">https://stackoverflow.com/a/1440795</a>
 */
public class APIzator1440795 {

  public static String period() {
    PeriodFormatter daysHoursMinutes = new PeriodFormatterBuilder()
      .appendDays()
      .appendSuffix(" day", " days")
      .appendSeparator(" and ")
      .appendMinutes()
      .appendSuffix(" minute", " minutes")
      .appendSeparator(" and ")
      .appendSeconds()
      .appendSuffix(" second", " seconds")
      .toFormatter();
    Period period = new Period(72, 24, 12, 0);
    System.out.println(daysHoursMinutes.print(period));
    return daysHoursMinutes.print(period.normalizedStandard());
  }
}
