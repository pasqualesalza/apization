package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.Period;
import com.google.appengine.repackaged.org.joda.time.format.PeriodFormatter;
import com.google.appengine.repackaged.org.joda.time.format.PeriodFormatterBuilder;

/**
 * How can I calculate a time span in Java and format the output?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2796052">https://stackoverflow.com/a/2796052</a>
 */
public class APIzator2796052 {

  public static String calculateSpan() throws Exception {
    DateTime myBirthDate = new DateTime(1978, 3, 26, 12, 35, 0, 0);
    DateTime now = new DateTime();
    Period period = new Period(myBirthDate, now);
    PeriodFormatter formatter = new PeriodFormatterBuilder()
      .appendYears()
      .appendSuffix(" year, ", " years, ")
      .appendMonths()
      .appendSuffix(" month, ", " months, ")
      .appendWeeks()
      .appendSuffix(" week, ", " weeks, ")
      .appendDays()
      .appendSuffix(" day, ", " days, ")
      .appendHours()
      .appendSuffix(" hour, ", " hours, ")
      .appendMinutes()
      .appendSuffix(" minute, ", " minutes, ")
      .appendSeconds()
      .appendSuffix(" second", " seconds")
      .printZeroNever()
      .toFormatter();
    String elapsed = formatter.print(period);
    return elapsed + " ago";
  }
}
