package com.stackoverflow.api;

import java.awt.*;
import javax.swing.*;

/**
 * Drawing an object using getGraphics() without extending JFrame
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15991175">https://stackoverflow.com/a/15991175</a>
 */
public class APIzator15991175 {

  public static void drawObject() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(600, 400);
    JPanel panel = new JPanel() {
      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 100, 100);
      }
    };
    frame.add(panel);
    // Graphics g = panel.getGraphics();
    // g.setColor(Color.BLUE);
    // g.fillRect(0, 0, 100, 100);
    // because you added panel after setVisible was called
    frame.validate();
    // because you added panel after setVisible was called
    frame.repaint();
  }
}
