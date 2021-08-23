package com.stackoverflow.api;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Display a jpg image on a JPanel
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1242670">https://stackoverflow.com/a/1242670</a>
 */
public class APIzator1242670 {

  public static void displayImage(String str1) throws Exception {
    ImageIcon image = new ImageIcon(str1);
    JLabel label = new JLabel("", image, JLabel.CENTER);
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(label, BorderLayout.CENTER);
  }
}
