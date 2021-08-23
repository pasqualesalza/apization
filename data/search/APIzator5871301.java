package com.stackoverflow.api;

/**
 * java SSL and cert keystore
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5871301">https://stackoverflow.com/a/5871301</a>
 */
public class APIzator5871301 {

  public static void ssl(String path_to_your_cacerts_file)
    throws Exception {
    System.setProperty("javax.net.ssl.trustStore", path_to_your_cacerts_file);
  }
}
