package com.stackoverflow.api;

import java.net.URLDecoder;

/**
 * How do you unescape URLs in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/624002">https://stackoverflow.com/a/624002</a>
 */
public class APIzator624002 {

  public static void unescapeUrl(String url) throws Exception {
    URLDecoder.decode(url);
  }
}
