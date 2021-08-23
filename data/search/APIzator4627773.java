package com.stackoverflow.api;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
 * Show JFrame in a specific screen in dual monitor configuration
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4627773">https://stackoverflow.com/a/4627773</a>
 */
public class APIzator4627773 {

  public static void showOnScreen(int screen, JFrame frame) {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] gs = ge.getScreenDevices();
    if (screen > -1 && screen < gs.length) {
      gs[screen].setFullScreenWindow(frame);
    } else if (gs.length > 0) {
      gs[0].setFullScreenWindow(frame);
    } else {
      throw new RuntimeException("No Screens Found");
    }
  }
}
