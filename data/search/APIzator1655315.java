package com.stackoverflow.api;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Java Swing: multiple windows
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1655315">https://stackoverflow.com/a/1655315</a>
 */
public class APIzator1655315 {

  public static void swing() throws Exception {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new JFrame("frame1").setVisible(true);
          new JFrame("frame2").setVisible(true);
        }
      }
    );
  }
}
