package com.stackoverflow.api;

import javax.swing.JButton;

/**
 * How to set String's font size, style in Java using the Font class?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10630763">https://stackoverflow.com/a/10630763</a>
 */
public class APIzator10630763 {

  public static void setSize() throws Exception {
    JButton b = new JButton();
    b.setFont(b.getFont().deriveFont(18.0f));
  }
}
