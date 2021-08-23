package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.SimpleDateFormat;

/**
 * Current timestamp as filename in Java
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7489888">https://stackoverflow.com/a/7489888</a>
 */
public class APIzator7489888 {

  public static String timestamp() throws Exception {
    return new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());
  }
}
