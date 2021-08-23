package com.stackoverflow.api;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Apache HttpClient 4.1 - Proxy Authentication
 *
 * classpath: httpcore-4.4.10:httpclient-4.5.6
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6972173">https://stackoverflow.com/a/6972173</a>
 */
public class APIzator6972173 {

  public static void httpclient() throws Exception {
    DefaultHttpClient httpclient = new DefaultHttpClient();
    httpclient
      .getCredentialsProvider()
      .setCredentials(
        new AuthScope("PROXY HOST", 8080),
        new UsernamePasswordCredentials("username", "password")
      );
    HttpHost targetHost = new HttpHost("TARGET HOST", 443, "https");
    HttpHost proxy = new HttpHost("PROXY HOST", 8080);
    httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
  }
}
