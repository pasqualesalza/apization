package com.stackoverflow.api;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * How to extract parameters from a given url
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5902142">https://stackoverflow.com/a/5902142</a>
 */
public class APIzator5902142 {

  public static Map<String, List<String>> getQueryParams(String url) {
    try {
      Map<String, List<String>> params = new HashMap<String, List<String>>();
      String[] urlParts = url.split("\\?");
      if (urlParts.length > 1) {
        String query = urlParts[1];
        for (String param : query.split("&amp;")) {
          String[] pair = param.split("=");
          String key = URLDecoder.decode(pair[0], "UTF-8");
          String value = "";
          if (pair.length > 1) {
            value = URLDecoder.decode(pair[1], "UTF-8");
          }
          List<String> values = params.get(key);
          if (values == null) {
            values = new ArrayList<String>();
            params.put(key, values);
          }
          values.add(value);
        }
      }
      return params;
    } catch (UnsupportedEncodingException ex) {
      throw new AssertionError(ex);
    }
  }
}
