package com.stackoverflow.api;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;

/**
 * Should HttpURLConnection with CookieManager automatically handle session cookies?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15546450">https://stackoverflow.com/a/15546450</a>
 */
public class APIzator15546450 {

  public static void handleCookie() throws Exception {
    CookieHandler.setDefault(new CookieManager());
    CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
  }
}
