package com.stackoverflow.api;

import android.widget.DatePicker;
import java.util.Calendar;

/**
 * getdate from datepicker android
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14590523">https://stackoverflow.com/a/14590523</a>
 */
public class APIzator14590523 {

  /**
   * @param datePicker
   * @return a java.util.Date
   */
  public static java.util.Date getDateFromDatePicker(DatePicker datePicker) {
    int day = datePicker.getDayOfMonth();
    int month = datePicker.getMonth();
    int year = datePicker.getYear();
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month, day);
    return calendar.getTime();
  }
}
