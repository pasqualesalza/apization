package com.stackoverflow.api;

import java.io.*;

/**
 * Starting a process in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3774444">https://stackoverflow.com/a/3774444</a>
 */
public class APIzator3774444 {

  public static void startProcess() {
    try {
      String line;
      Process p = Runtime
        .getRuntime()
        .exec(System.getenv("windir") + "\\system32\\" + "tree.com /A");
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
