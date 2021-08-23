package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * How to convert List to Json in Java
 *
 * classpath: appengine-api-1.0-sdk-1.9.67
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14229020">https://stackoverflow.com/a/14229020</a>
 */
public class APIzator14229020 {

  public static String convertList(List<String> foo) throws Exception {
    return new Gson().toJson(foo);
  }
}
