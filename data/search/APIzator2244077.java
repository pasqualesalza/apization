package com.stackoverflow.api;

/**
 * how to execute command line .exe file in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2244077">https://stackoverflow.com/a/2244077</a>
 */
public class APIzator2244077 {

  public static void executeLine(String[] cmd) throws Exception {
    Process p = Runtime.getRuntime().exec(cmd);
    p.waitFor();
  }
}
