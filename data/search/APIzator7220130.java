package com.stackoverflow.api;

/**
 * Java and SSL certificates
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7220130">https://stackoverflow.com/a/7220130</a>
 */
public class APIzator7220130 {

  public static void java() throws Exception {
    System.setProperty("javax.net.ssl.trustStore", "<path_to_truststore>");
    System.setProperty(
      "javax.net.ssl.trustStorePassword",
      "<truststore_password>"
    );
  }
}
