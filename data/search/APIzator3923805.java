package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.GsonBuilder;

/**
 * Gson ignoring map entries with value=null
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3923805">https://stackoverflow.com/a/3923805</a>
 */
public class APIzator3923805 {

  public static Gson null_() throws Exception {
    return new GsonBuilder().serializeNulls().create();
  }
}
