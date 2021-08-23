package com.stackoverflow.api;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * java JPanel How to fixed sizes
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19936269">https://stackoverflow.com/a/19936269</a>
 */
public class APIzator19936269 extends JFrame {

  public static void fixSize() {
    JFrame frame = new JFrame();
    frame.getContentPane().setLayout(new BorderLayout());
    JPanel green = new JPanel();
    green.setPreferredSize(new Dimension(80, 150));
    green.setBackground(Color.GREEN);
    JPanel yellow = new JPanel();
    yellow.setBackground(Color.YELLOW);
    frame.getContentPane().add(green, BorderLayout.PAGE_START);
    frame.getContentPane().add(yellow, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
