package com.stackoverflow.api;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Format Instant to String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27483371">https://stackoverflow.com/a/27483371</a>
 */
public class APIzator27483371 {

  public static String instant() throws Exception {
    DateTimeFormatter formatter = DateTimeFormatter
      .ofLocalizedDateTime(FormatStyle.SHORT)
      .withLocale(Locale.UK)
      .withZone(ZoneId.systemDefault());
    Instant instant = Instant.now();
    String output = formatter.format(instant);
    System.out.println(
      "formatter: " +
      formatter +
      " with zone: " +
      formatter.getZone() +
      " and Locale: " +
      formatter.getLocale()
    );
    System.out.println("instant: " + instant);
    return output;
  }
}
