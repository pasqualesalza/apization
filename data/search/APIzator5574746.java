package com.stackoverflow.api;

import java.util.Calendar;

/**
 * What is the easiest way to get the current day of the week in Android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5574746">https://stackoverflow.com/a/5574746</a>
 */
public class APIzator5574746 {

  public static void be() throws Exception {
    Calendar calendar = Calendar.getInstance();
    int day = calendar.get(Calendar.DAY_OF_WEEK);
    switch (day) {
      case Calendar.SUNDAY:
      // Current day is Sunday
      case Calendar.MONDAY:
      // Current day is Monday
      case Calendar.TUESDAY:
    }
  }
}
