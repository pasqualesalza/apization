package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * How to execute bash command with sudo privileges in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18708275">https://stackoverflow.com/a/18708275</a>
 */
public class APIzator18708275 {

  public static void executeCommand(String[] cmd) throws IOException {
    Process pb = Runtime.getRuntime().exec(cmd);
    String line;
    BufferedReader input = new BufferedReader(
      new InputStreamReader(pb.getInputStream())
    );
    while ((line = input.readLine()) != null) {
      System.out.println(line);
    }
    input.close();
  }
}
