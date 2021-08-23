package com.stackoverflow.api;

import javax.swing.JLabel;

/**
 * How to add text to JFrame?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13662648">https://stackoverflow.com/a/13662648</a>
 */
public class APIzator13662648 {

  public static void addText() throws Exception {
    JLabel label1 = new JLabel("Test");
    label1.setText("Label Text");
    label1.setText("");
  }
}
