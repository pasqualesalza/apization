package com.stackoverflow.api;

import java.net.URLDecoder;

/**
 * URLDecoder: Illegal hex characters in escape (%) pattern - For input string: "</"
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6223859">https://stackoverflow.com/a/6223859</a>
 */
public class APIzator6223859 {

  public static String replacer(StringBuffer outBuffer) {
    String data = outBuffer.toString();
    try {
      StringBuffer tempBuffer = new StringBuffer();
      int incrementor = 0;
      int dataLength = data.length();
      while (incrementor < dataLength) {
        char charecterAt = data.charAt(incrementor);
        if (charecterAt == '%') {
          tempBuffer.append("<percentage>");
        } else if (charecterAt == '+') {
          tempBuffer.append("<plus>");
        } else {
          tempBuffer.append(charecterAt);
        }
        incrementor++;
      }
      data = tempBuffer.toString();
      data = URLDecoder.decode(data, "utf-8");
      data = data.replaceAll("<percentage>", "%");
      data = data.replaceAll("<plus>", "+");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return data;
  }
}
