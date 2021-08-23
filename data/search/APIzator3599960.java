package com.stackoverflow.api;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * How can I determine if the column name exist in the ResultSet?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3599960">https://stackoverflow.com/a/3599960</a>
 */
public class APIzator3599960 {

  public static boolean hasColumn(ResultSet rs, String columnName)
    throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int columns = rsmd.getColumnCount();
    for (int x = 1; x <= columns; x++) {
      if (columnName.equals(rsmd.getColumnName(x))) {
        return true;
      }
    }
    return false;
  }
}
