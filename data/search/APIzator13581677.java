package com.stackoverflow.api;

/**
 * displaying AM and PM in small letter after date formatting
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13581677">https://stackoverflow.com/a/13581677</a>
 */
public class APIzator13581677 {

  public static String displayAm(String oldstr) throws Exception {
    return oldstr.replace("AM", "am").replace("PM", "pm");
  }
}
