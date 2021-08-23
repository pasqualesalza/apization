package com.stackoverflow.api;

/**
 * Breaking out of a for loop in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15275222">https://stackoverflow.com/a/15275222</a>
 */
public class APIzator15275222 {

  public static void break_() throws Exception {
    for (int x = 10; x < 20; x++) {
      // The below condition can be present before or after your sysouts, depending on your needs.
      if (x == 15) {
        // A unlabeled break is enough. You don't need a labeled break here.
        break;
      }
      System.out.print("value of x : " + x);
      System.out.print("\n");
    }
  }
}
