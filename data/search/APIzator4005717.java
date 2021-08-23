package com.stackoverflow.api;

/**
 * console.writeline and System.out.println
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4005717">https://stackoverflow.com/a/4005717</a>
 */
public class APIzator4005717 {

  public static void consolewriteline(String[] data) {
    for (String s : data) {
      System.out.println(s);
    }
    for (String s : data) {
      System.console().writer().println(s);
    }
  }
}
