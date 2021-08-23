package com.stackoverflow.api;

import com.amazonaws.internal.config.Builder;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Apache HttpComponents HttpClient timeout
 *
 * classpath: httpclient-4.5.6:aws-java-sdk-core-1.11.446
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19836903">https://stackoverflow.com/a/19836903</a>
 */
public class APIzator19836903 {

  public static HttpClient timeout(int timeout) throws Exception {
    RequestConfig.Builder requestBuilder = RequestConfig.custom();
    requestBuilder = requestBuilder.setConnectTimeout(timeout);
    requestBuilder = requestBuilder.setConnectionRequestTimeout(timeout);
    HttpClientBuilder builder = HttpClientBuilder.create();
    builder.setDefaultRequestConfig(requestBuilder.build());
    return builder.build();
  }
}
