package com.stackoverflow.api;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Change JLabel Font size
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17884919">https://stackoverflow.com/a/17884919</a>
 */
public class APIzator17884919 {

  public static void size() throws Exception {
    JFrame frame = new JFrame("Test");
    JLabel label = new JLabel("Font Test");
    label.setFont(label.getFont().deriveFont(64.0f));
    frame.getContentPane().add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
