package com.stackoverflow.api;

/**
 * Why am I receiving a java.net.SocketException: Connection reset error from web service through SOAP UI and Java client?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17460999">https://stackoverflow.com/a/17460999</a>
 */
public class APIzator17460999 {

  public static void receiveJavanet() throws Exception {
    System.setProperty("https.protocols", "SSLv3");
  }
}
