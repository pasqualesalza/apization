package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;

/**
 * Java Loop every minute
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2702999">https://stackoverflow.com/a/2702999</a>
 */
public class APIzator2702999 {

  public static void loop() throws Exception {
    try {
      while (true) {
        System.out.println(new Date());
        Thread.sleep(5 * 1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
