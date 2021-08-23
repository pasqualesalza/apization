package com.stackoverflow.api;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Java - how do I prevent WindowClosing from actually closing the window
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7613653">https://stackoverflow.com/a/7613653</a>
 */
public class APIzator7613653 {

  public static void preventWindowclosing() {
    final JFrame frame = new JFrame("Test");
    frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent ev) {
          // frame.dispose();
        }
      }
    );
    frame.setVisible(true);
  }
}
