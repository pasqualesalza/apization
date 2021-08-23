package com.stackoverflow.api;

import javax.swing.JOptionPane;

/**
 * Why is my Runnable Jar file not working
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16702670">https://stackoverflow.com/a/16702670</a>
 */
public class APIzator16702670 {

  public static void work() {
    try {
      // body of main method goes here, including any other error handling
    } catch (Throwable t) {
      JOptionPane.showMessageDialog(
        null,
        t.getClass().getSimpleName() + ": " + t.getMessage()
      );
      // don't suppress Throwable
      throw t;
    }
  }
}
