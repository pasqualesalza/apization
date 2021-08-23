package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * Calculate number of weekdays between two dates in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4600057">https://stackoverflow.com/a/4600057</a>
 */
public class APIzator4600057 {

  public static int getWorkingDaysBetweenTwoDates(
    Date startDate,
    Date endDate
  ) {
    Calendar startCal = Calendar.getInstance();
    startCal.setTime(startDate);
    Calendar endCal = Calendar.getInstance();
    endCal.setTime(endDate);
    int workDays = 0;
    // Return 0 if start and end are the same
    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
      return 0;
    }
    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
      startCal.setTime(endDate);
      endCal.setTime(startDate);
    }
    do {
      // excluding start date
      startCal.add(Calendar.DAY_OF_MONTH, 1);
      if (
        startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
        startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
      ) {
        ++workDays;
      }
    } while ( // excluding end date
      startCal.getTimeInMillis() < endCal.getTimeInMillis()
    );
    return workDays;
  }
}
