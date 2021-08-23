package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;

/**
 * How to convert List to a JSON Object using GSON?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/27893385">https://stackoverflow.com/a/27893385</a>
 */
public class APIzator27893385 {

  public static void convertList(int response) throws Exception {
    Gson gson = new Gson();
    gson.toJson(response);
  }
}
