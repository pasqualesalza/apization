package com.stackoverflow.api;

import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * Swing JTextField how to remove the border?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2281980">https://stackoverflow.com/a/2281980</a>
 */
public class APIzator2281980 {

  public static void swingJtextfield() throws Exception {
    JTextField text = new JTextField() {
      @Override
      public void setBorder(Border border) {
        // No!
      }
    };
  }
}
