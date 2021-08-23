package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.SimpleDateFormat;

/**
 * Java program : need current Date in YYYY-MM-DD format without time in Date datatype
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16413057">https://stackoverflow.com/a/16413057</a>
 */
public class APIzator16413057 {

  public static String needDate() throws Exception {
    Date date = new Date();
    return new SimpleDateFormat("yyyy-MM-dd").format(date);
  }
}
