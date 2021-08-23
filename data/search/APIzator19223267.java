package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.SimpleDateFormat;

/**
 * java.util.Date format SSSSSS: if not microseconds what are the last 3 digits?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19223267">https://stackoverflow.com/a/19223267</a>
 */
public class APIzator19223267 {

  public static String execute() throws Exception {
    Date d = new Date();
    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(d));
    System.out.println(
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(d)
    );
    System.out.println(
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(d)
    );
    System.out.println(
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS").format(d)
    );
    System.out.println(
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSS").format(d)
    );
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").format(d);
  }
}
