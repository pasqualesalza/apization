package com.stackoverflow.api;

/**
 * Check your login and password (Java Web, Servlets)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16264564">https://stackoverflow.com/a/16264564</a>
 */
public class APIzator16264564 {

  public static void checkLogin(
    String dbPassword,
    String username,
    String password,
    String dbUsername
  ) throws Exception {
    if (dbUsername == username && dbPassword == password) {}
    if (dbUsername.equals(username) && dbPassword.equals(password)) {}
  }
}
