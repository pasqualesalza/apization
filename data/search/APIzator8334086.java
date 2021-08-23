package com.stackoverflow.api;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Displaying an image in Java Swing
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8334086">https://stackoverflow.com/a/8334086</a>
 */
public class APIzator8334086 {

  // *** your image path will be different *****
  private static final String IMG_PATH = "src/images/image01.jpg";

  public static void displayImage() {
    try {
      BufferedImage img = ImageIO.read(new File(IMG_PATH));
      ImageIcon icon = new ImageIcon(img);
      JLabel label = new JLabel(icon);
      JOptionPane.showMessageDialog(null, label);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
