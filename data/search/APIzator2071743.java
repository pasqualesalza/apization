package com.stackoverflow.api;

import java.io.*;

/**
 * How to Execute SQL Script File in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2071743">https://stackoverflow.com/a/2071743</a>
 */
public class APIzator2071743 {

  public static void executeFile() {
    try {
      String line;
      Process p = Runtime
        .getRuntime()
        .exec("psql -U username -d dbname -h serverhost -f scripfile.sql");
      BufferedReader input = new BufferedReader(
        new InputStreamReader(p.getInputStream())
      );
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
      input.close();
    } catch (Exception err) {
      err.printStackTrace();
    }
  }
}
