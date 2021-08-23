package com.stackoverflow.api;

/**
 * How to exit two nested loops
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6638330">https://stackoverflow.com/a/6638330</a>
 */
public class APIzator6638330 {

  public static void exitLoop(int goal) throws Exception {
    int points = 0;
    mainLoop:while (goal <= 100) {
      for (int i = 0; i < goal; i++) {
        if (points > 50) {
          break mainLoop;
        }
        points += i;
      }
    }
  }
}
