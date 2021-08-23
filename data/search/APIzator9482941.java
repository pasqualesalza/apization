package com.stackoverflow.api;

import android.util.Log;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Getting the current time zone in android application
 *
 * classpath: android-4.1.1.4
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9482941">https://stackoverflow.com/a/9482941</a>
 */
public class APIzator9482941 {

  public static void getZone() throws Exception {
    Calendar cal = Calendar.getInstance();
    TimeZone tz = cal.getTimeZone();
    Log.d("Time zone", "=" + tz.getDisplayName());
  }
}
