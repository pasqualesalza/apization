package com.stackoverflow.api;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Connecting to remote URL which requires authentication using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/496707">https://stackoverflow.com/a/496707</a>
 */
public class APIzator496707 {

  public static void connect() throws Exception {
    Authenticator.setDefault(
      new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(
            "username",
            "password".toCharArray()
          );
        }
      }
    );
  }
}
