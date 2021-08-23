package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Getting URL parameter in java and extract a specific text from that URL
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11733697">https://stackoverflow.com/a/11733697</a>
 */
public class APIzator11733697 {

  public static Map<String, String> getQueryMap(String query) {
    String[] params = query.split("&amp;");
    Map<String, String> map = new HashMap<String, String>();
    for (String param : params) {
      String name = param.split("=")[0];
      String value = param.split("=")[1];
      map.put(name, value);
    }
    return map;
  }
}
