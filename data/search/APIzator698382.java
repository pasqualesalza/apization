package com.stackoverflow.api;

import java.text.MessageFormat;

/**
 * How do you format a fractional percentage with java.text.MessageFormat
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/698382">https://stackoverflow.com/a/698382</a>
 */
public class APIzator698382 {

  public static String formatPercentage(int fraction) throws Exception {
    return MessageFormat.format("{0,number,#.##%}", fraction);
  }
}
