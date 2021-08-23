package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;

/**
 * How to serialize Object to JSON?
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16607559">https://stackoverflow.com/a/16607559</a>
 */
public class APIzator16607559 {

  public static String serializeObject(int listaDePontos)
    throws Exception {
    Gson gson = new Gson();
    return gson.toJson(listaDePontos);
  }
}
