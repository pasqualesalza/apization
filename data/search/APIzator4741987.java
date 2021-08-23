package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Redirect Runtime.getRuntime().exec() output with System.setOut();
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4741987">https://stackoverflow.com/a/4741987</a>
 */
public class APIzator4741987 {

  public static void output() throws Exception {
    System.setOut(new PrintStream(new FileOutputStream("test.txt")));
    System.out.println("HelloWorld1");
    try {
      String line;
      Process p = Runtime.getRuntime().exec("echo HelloWorld2");
      BufferedReader in = new BufferedReader(
        new InputStreamReader(p.getInputStream())
      );
      while ((line = in.readLine()) != null) {
        System.out.println(line);
      }
      in.close();
    } catch (Exception e) {
      // ...
    }
  }
}
