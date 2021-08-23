package com.stackoverflow.api;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * How to simulate keyboard presses in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7746017">https://stackoverflow.com/a/7746017</a>
 */
public class APIzator7746017 {

  public static void simulatePress() throws Exception {
    try {
      Robot robot = new Robot();
      // Simulate a mouse click
      robot.mousePress(InputEvent.BUTTON1_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_MASK);
      // Simulate a key press
      robot.keyPress(KeyEvent.VK_A);
      robot.keyRelease(KeyEvent.VK_A);
    } catch (AWTException e) {
      e.printStackTrace();
    }
  }
}
