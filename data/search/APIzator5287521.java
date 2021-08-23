package com.stackoverflow.api;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * how to put Image on JPanel using Netbeans
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5287521">https://stackoverflow.com/a/5287521</a>
 */
public class APIzator5287521 {

  public static void putImage(String str1) throws Exception {
    JPanel panel = new JPanel();
    ImageIcon icon = new ImageIcon(str1);
    JLabel label = new JLabel();
    label.setIcon(icon);
    panel.add(label);
  }
}
