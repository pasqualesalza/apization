package com.stackoverflow.api;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Java Web Service client basic authentication
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7086636">https://stackoverflow.com/a/7086636</a>
 */
public class APIzator7086636 {

  public static void authentication() throws Exception {
    Authenticator myAuth = new Authenticator() {
      @Override
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("german", "german".toCharArray());
      }
    };
    Authenticator.setDefault(myAuth);
  }
}
