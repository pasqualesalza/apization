package com.stackoverflow.api;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;

/**
 * Java get month string from integer
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5799175">https://stackoverflow.com/a/5799175</a>
 */
public class APIzator5799175 {

  public static String getString(String monthString, int month, int date)
    throws Exception {
    monthString = new DateFormatSymbols().getMonths()[month - 1];
    return new SimpleDateFormat("MMMM").format(date);
  }
}
