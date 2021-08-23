package com.stackoverflow.api;

import java.io.*;
import java.sql.*;

/**
 * Correct way to find rowcount in Java JDBC
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13103087">https://stackoverflow.com/a/13103087</a>
 */
public class APIzator13103087 {

  public static void way() {
    System.out.println("Count number of rows in a specific table!");
    Connection con = null;
    int count = 0;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/jdbctutorial",
          "root",
          "root"
        );
      try {
        Statement st = con.createStatement();
        BufferedReader bf = new BufferedReader(
          new InputStreamReader(System.in)
        );
        System.out.println("Enter table name:");
        String table = bf.readLine();
        ResultSet res = st.executeQuery("SELECT COUNT(*) FROM " + table);
        while (res.next()) {
          count = res.getInt(1);
        }
        System.out.println("Number of row:" + count);
      } catch (SQLException s) {
        System.out.println("SQL statement is not executed!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
