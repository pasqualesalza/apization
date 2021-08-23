package com.stackoverflow.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/**
 * If I have a specific date of a day, how do I get the date of that day in the previous week?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/38520847">https://stackoverflow.com/a/38520847</a>
 */
public class APIzator38520847 {

  public static LocalDate getDate() throws Exception {
    LocalDate localDate = LocalDate.of(2011, Month.JULY, 3);
    LocalDate weekPrior = localDate.minusWeeks(1);
    return localDate.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
  }
}
