package com.stackoverflow.api;

import javax.swing.UIManager;

/**
 * How to improve look and feel of JAVA swing GUI?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2592258">https://stackoverflow.com/a/2592258</a>
 */
public class APIzator2592258 {

  public static void improveLook() throws Exception {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
