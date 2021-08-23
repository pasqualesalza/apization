package com.stackoverflow.api;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;

/**
 * Creating a json object using jackson
 *
 * classpath: jackson-databind-2.9.7
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16974850">https://stackoverflow.com/a/16974850</a>
 */
public class APIzator16974850 {

  public static JsonNodeFactory createObject() throws Exception {
    return JsonNodeFactory.instance;
  }
}
