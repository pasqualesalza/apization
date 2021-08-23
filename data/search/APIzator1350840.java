package com.stackoverflow.api;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * What is the purpose of JNDI
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1350840">https://stackoverflow.com/a/1350840</a>
 */
public class APIzator1350840 {

  public static void be() throws Exception {
    DataSource dataSource = null;
    try {
      Context context = new InitialContext();
      dataSource = (DataSource) context.lookup("Database");
    } catch (NamingException e) {
      // Couldn't find the data source: give up
    }
  }
}
