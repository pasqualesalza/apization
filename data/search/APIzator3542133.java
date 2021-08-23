package com.stackoverflow.api;

import org.springframework.web.context.request.RequestContextHolder;

/**
 * Retrieving Session ID with Spring Security
 *
 * classpath: spring-web-5.1.2.RELEASE
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3542133">https://stackoverflow.com/a/3542133</a>
 */
public class APIzator3542133 {

  public static void retrieveId() throws Exception {
    RequestContextHolder.currentRequestAttributes().getSessionId();
  }
}
