package com.stackoverflow.api;

import java.io.*;

/**
 * How to run Windows commands in JAVA and return the result text as a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8963444">https://stackoverflow.com/a/8963444</a>
 */
public class APIzator8963444 {

  public static void runCommand() {
    try {
      Process p = Runtime.getRuntime().exec("cmd /c dir");
      p.waitFor();
      BufferedReader reader = new BufferedReader(
        new InputStreamReader(p.getInputStream())
      );
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e1) {
      e1.printStackTrace();
    } catch (InterruptedException e2) {
      e2.printStackTrace();
    }
    System.out.println("Done");
  }
}
