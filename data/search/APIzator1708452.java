package com.stackoverflow.api;

/**
 * Java: Literal percent sign in printf statement
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1708452">https://stackoverflow.com/a/1708452</a>
 */
public class APIzator1708452 {

  public static void java(int support, int ID, int pattern, int confidence)
    throws Exception {
    System.out.printf(
      "%s\t%s\t%1.2f%%\t%1.2f%%\n",
      ID,
      pattern,
      support,
      confidence
    );
  }
}
