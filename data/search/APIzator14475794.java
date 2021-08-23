package com.stackoverflow.api;

import java.util.GregorianCalendar;

/**
 * java get the first date and last date of given month and given year
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14475794">https://stackoverflow.com/a/14475794</a>
 */
public class APIzator14475794 {

  public static java.util.Date getDate(int year, int month)
    throws Exception {
    GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);
    java.util.Date monthEndDate = new java.util.Date(gc.getTime().getTime());
    return monthEndDate;
  }
}
