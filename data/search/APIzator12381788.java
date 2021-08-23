package com.stackoverflow.api;

/**
 * How can I display all the HTTP Headers when using the DefaultHTTPClient?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12381788">https://stackoverflow.com/a/12381788</a>
 */
public class APIzator12381788 {

  public static void displayHeaders() throws Exception {
    java.util.logging.Logger
      .getLogger("org.apache.http.wire")
      .setLevel(java.util.logging.Level.FINEST);
    java.util.logging.Logger
      .getLogger("org.apache.http.headers")
      .setLevel(java.util.logging.Level.FINEST);
    System.setProperty(
      "org.apache.commons.logging.Log",
      "org.apache.commons.logging.impl.SimpleLog"
    );
    System.setProperty(
      "org.apache.commons.logging.simplelog.showdatetime",
      "true"
    );
    System.setProperty(
      "org.apache.commons.logging.simplelog.log.httpclient.wire",
      "debug"
    );
    System.setProperty(
      "org.apache.commons.logging.simplelog.log.org.apache.http",
      "debug"
    );
    System.setProperty(
      "org.apache.commons.logging.simplelog.log.org.apache.http.headers",
      "debug"
    );
  }
}
