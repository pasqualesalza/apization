package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;

/**
 * How can I turn a JSONArray into a JSONObject?
 *
 * classpath: gwt-user-2.8.2
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7193753">https://stackoverflow.com/a/7193753</a>
 */
public class APIzator7193753 {

  public static void turnJsonarray() throws Exception {
    JSONObject jo = new JSONObject();
    JSONArray ja = new JSONArray();
    // populate the array
    jo.put("arrayName", ja);
  }
}
