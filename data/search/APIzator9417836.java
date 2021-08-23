package com.stackoverflow.api;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 * Bufferedimage resize
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9417836">https://stackoverflow.com/a/9417836</a>
 */
public class APIzator9417836 {

  public static BufferedImage resize(BufferedImage img, int newW, int newH) {
    Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
    BufferedImage dimg = new BufferedImage(
      newW,
      newH,
      BufferedImage.TYPE_INT_ARGB
    );
    Graphics2D g2d = dimg.createGraphics();
    g2d.drawImage(tmp, 0, 0, null);
    g2d.dispose();
    return dimg;
  }
}
