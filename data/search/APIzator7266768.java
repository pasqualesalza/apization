package com.stackoverflow.api;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/**
 * Java SSLException: hostname in certificate didn't match
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7266768">https://stackoverflow.com/a/7266768</a>
 */
public class APIzator7266768 {

  public static void sslexception() throws Exception {
    // Do not do this in production!!!
    HttpsURLConnection.setDefaultHostnameVerifier(
      new HostnameVerifier() {
        public boolean verify(String string, SSLSession ssls) {
          return true;
        }
      }
    );
  }
}
