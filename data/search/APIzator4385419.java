package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * How to connect Java to Mysql?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4385419">https://stackoverflow.com/a/4385419</a>
 */
public class APIzator4385419 {

  public static void connectJava(String myDriver, String myUrl)
    throws Exception {
    try {
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      // your prepstatements goes here...
      conn.close();
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}
