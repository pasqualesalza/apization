package com.stackoverflow.api;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * "Always on Top" Windows with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/297948">https://stackoverflow.com/a/297948</a>
 */
public class APIzator297948 {

  public static void execute() {
    JFrame frame = new JFrame("Hello!!");
    // Set's the window to be "always on top"
    frame.setAlwaysOnTop(true);
    frame.setLocationByPlatform(true);
    frame.add(new JLabel("  Isn't this annoying?"));
    frame.pack();
    frame.setVisible(true);
  }
}
