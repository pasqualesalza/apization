package com.stackoverflow.api;

import java.io.*;
import java.net.*;

/**
 * Check if file exists on remote server using its URL
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4596483">https://stackoverflow.com/a/4596483</a>
 */
public class APIzator4596483 {

  public static boolean exists(String URLName) {
    try {
      HttpURLConnection.setFollowRedirects(false);
      // note : you may also need
      // HttpURLConnection.setInstanceFollowRedirects(false)
      HttpURLConnection con = (HttpURLConnection) new URL(URLName)
        .openConnection();
      con.setRequestMethod("HEAD");
      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}
