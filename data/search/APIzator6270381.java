package com.stackoverflow.api;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * how to open warning/information/error dialog in swing?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6270381">https://stackoverflow.com/a/6270381</a>
 */
public class APIzator6270381 {

  public static void openDialog(Component frame) throws Exception {
    JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
  }
}
