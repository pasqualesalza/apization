package com.stackoverflow.api;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * How do I set the R, G, B and Alpha components of a color?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6734194">https://stackoverflow.com/a/6734194</a>
 */
public class APIzator6734194 {

  public static void setR(int alpha, int blue, int green, int red)
    throws Exception {
    Color c = new Color(red, green, blue, alpha);
    BufferedImage image = new BufferedImage(
      300,
      200,
      BufferedImage.TYPE_INT_ARGB
    );
    Graphics graphics = image.getGraphics();
    graphics.setColor(c);
    graphics.fillRect(50, 50, 100, 100);
    graphics.dispose();
    image.setRGB(50, 50, c.getRGB());
  }
}
