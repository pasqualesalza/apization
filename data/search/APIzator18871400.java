package com.stackoverflow.api;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * How do i load images in Jframe java(eclipse)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18871400">https://stackoverflow.com/a/18871400</a>
 */
public class APIzator18871400 {

  public static void loadImage(String path) throws IOException {
    File file = new File(path);
    BufferedImage image = ImageIO.read(file);
    JLabel label = new JLabel(new ImageIcon(image));
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(label);
    f.pack();
    f.setLocation(200, 200);
    f.setVisible(true);
  }
}
