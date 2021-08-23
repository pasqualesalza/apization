package com.stackoverflow.api;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Setting minimum size limit for a window in java swing
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2782041">https://stackoverflow.com/a/2782041</a>
 */
public class APIzator2782041 {

  public static void setLimit() {
    JFrame frame = new JFrame("Hello World");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setMinimumSize(new Dimension(100, 100));
    frame.setVisible(true);
  }
}
