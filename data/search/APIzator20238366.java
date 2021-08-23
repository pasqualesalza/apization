package com.stackoverflow.api;

import java.text.SimpleDateFormat;

/**
 * Date in to UTC format Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20238366">https://stackoverflow.com/a/20238366</a>
 */
public class APIzator20238366 {

  public static void date(int dateObj) throws Exception {
    new SimpleDateFormat("MM/dd/yyyy KK:mm:ss a Z").format(dateObj);
  }
}
