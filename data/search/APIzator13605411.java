package com.stackoverflow.api;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 * Java converting Image to BufferedImage
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13605411">https://stackoverflow.com/a/13605411</a>
 */
public class APIzator13605411 {

  /**
   * Converts a given Image into a BufferedImage
   *
   * @param img The Image to be converted
   * @return The converted BufferedImage
   */
  public static BufferedImage toBufferedImage(Image img) {
    if (img instanceof BufferedImage) {
      return (BufferedImage) img;
    }
    // Create a buffered image with transparency
    BufferedImage bimage = new BufferedImage(
      img.getWidth(null),
      img.getHeight(null),
      BufferedImage.TYPE_INT_ARGB
    );
    // Draw the image on to the buffered image
    Graphics2D bGr = bimage.createGraphics();
    bGr.drawImage(img, 0, 0, null);
    bGr.dispose();
    // Return the buffered image
    return bimage;
  }
}
