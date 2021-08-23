package com.stackoverflow.api;

/**
 * How to connect to a secure website using SSL in Java with a pkcs12 file?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/573468">https://stackoverflow.com/a/573468</a>
 */
public class APIzator573468 {

  public static void connect() throws Exception {
    System.setProperty("javax.net.ssl.trustStore", "myTrustStore");
    System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
    System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
    System.setProperty("javax.net.ssl.keyStore", "new.p12");
    System.setProperty("javax.net.ssl.keyStorePassword", "newpasswd");
  }
}
