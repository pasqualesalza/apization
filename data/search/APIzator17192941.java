package com.stackoverflow.api;

import android.text.format.DateFormat;

/**
 * Get Value Of Day Month form Date Object in Android?
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17192941">https://stackoverflow.com/a/17192941</a>
 */
public class APIzator17192941 {

  public static String get(int date) throws Exception {
    // Thursday
    String dayOfTheWeek = (String) DateFormat.format("EEEE", date);
    // 20
    String day = (String) DateFormat.format("dd", date);
    // Jun
    String monthString = (String) DateFormat.format("MMM", date);
    // 06
    String monthNumber = (String) DateFormat.format("MM", date);
    return (String) DateFormat.format("yyyy", date);
  }
}
