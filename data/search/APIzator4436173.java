package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * How to connect to local host using JDBC?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4436173">https://stackoverflow.com/a/4436173</a>
 */
public class APIzator4436173 {

  public static Connection connect(
    String driverName,
    String serverName,
    String mydatabase,
    String username,
    String password
  ) throws Exception {
    Class.forName(driverName);
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    return DriverManager.getConnection(url, username, password);
  }
}
