package com.stackoverflow.api;

import java.text.DateFormatSymbols;
import java.util.Locale;

/**
 * How to get localized short day-in-week name (Mo/Tu/We/Th...)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3791277">https://stackoverflow.com/a/3791277</a>
 */
public class APIzator3791277 {

  public static void name() throws Exception {
    DateFormatSymbols symbols = new DateFormatSymbols(new Locale("it"));
    // for the current Locale :
    // DateFormatSymbols symbols = new DateFormatSymbols();
    String[] dayNames = symbols.getShortWeekdays();
    for (String s : dayNames) {
      System.out.print(s + " ");
    }
    // output :  dom lun mar mer gio ven sab
  }
}
