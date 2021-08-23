package com.stackoverflow.api;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Authenticated HTTP proxy with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1626616">https://stackoverflow.com/a/1626616</a>
 */
public class APIzator1626616 {

  public static void proxy(String authUser, String authPassword)
    throws Exception {
    Authenticator.setDefault(
      new Authenticator() {
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(
            authUser,
            authPassword.toCharArray()
          );
        }
      }
    );
    System.setProperty("http.proxyUser", authUser);
    System.setProperty("http.proxyPassword", authPassword);
  }
}
