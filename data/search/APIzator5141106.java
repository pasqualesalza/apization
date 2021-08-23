package com.stackoverflow.api;

/**
 * how to set a switch statement in while loop in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5141106">https://stackoverflow.com/a/5141106</a>
 */
public class APIzator5141106 {

  public static void setStatement(int monTotal, int input, int goodTotal)
    throws Exception {
    loop:while (goodTotal > 0 && monTotal > 0) {
      // ...
      switch (input) {
        case 'f':
          // ...
          break loop;
        case 'r':
          // ...
          break loop;
      }
      // ...
    }
  }
}
