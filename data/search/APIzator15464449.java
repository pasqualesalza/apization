package com.stackoverflow.api;

import java.io.*;

/**
 * Run cmd commands through java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15464449">https://stackoverflow.com/a/15464449</a>
 */
public class APIzator15464449 {

  public static void command() throws Exception {
    ProcessBuilder builder = new ProcessBuilder(
      "cmd.exe",
      "/c",
      "cd \"C:\\Program Files\\Microsoft SQL Server\" && dir"
    );
    builder.redirectErrorStream(true);
    Process p = builder.start();
    BufferedReader r = new BufferedReader(
      new InputStreamReader(p.getInputStream())
    );
    String line;
    while (true) {
      line = r.readLine();
      if (line == null) {
        break;
      }
      System.out.println(line);
    }
  }
}
