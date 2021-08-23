package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.JsonArray;
import com.google.appengine.repackaged.com.google.gson.JsonElement;
import com.google.appengine.repackaged.com.google.gson.JsonParser;

/**
 * Can't Convert string to JsonArray
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6455383">https://stackoverflow.com/a/6455383</a>
 */
public class APIzator6455383 {

  public static JsonArray convertString(String s) throws Exception {
    System.out.println("String to Json Array Stmt");
    JsonParser parser = new JsonParser();
    JsonElement tradeElement = parser.parse(s);
    JsonArray trade = tradeElement.getAsJsonArray();
    return trade;
  }
}
