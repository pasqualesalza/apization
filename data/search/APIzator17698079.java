package com.stackoverflow.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Check if a given time lies between two times regardless of date
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17698079">https://stackoverflow.com/a/17698079</a>
 */
public class APIzator17698079 {

  public static void check(
    String string1,
    String string2,
    String someRandomTime
  ) throws Exception {
    try {
      Date time1 = new SimpleDateFormat("HH:mm:ss").parse(string1);
      Calendar calendar1 = Calendar.getInstance();
      calendar1.setTime(time1);
      Date time2 = new SimpleDateFormat("HH:mm:ss").parse(string2);
      Calendar calendar2 = Calendar.getInstance();
      calendar2.setTime(time2);
      calendar2.add(Calendar.DATE, 1);
      Date d = new SimpleDateFormat("HH:mm:ss").parse(someRandomTime);
      Calendar calendar3 = Calendar.getInstance();
      calendar3.setTime(d);
      calendar3.add(Calendar.DATE, 1);
      Date x = calendar3.getTime();
      if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
        // checkes whether the current time is between 14:49:00 and 20:11:13.
        System.out.println(true);
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
