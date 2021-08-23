package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;

/**
 * Convert object to JSON in Android
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5571130">https://stackoverflow.com/a/5571130</a>
 */
public class APIzator5571130 {

  public static String object(int myObj) throws Exception {
    Gson gson = new Gson();
    return gson.toJson(myObj);
  }
}
