package com.stackoverflow.api;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImage;

/**
 * Zoom in and out of images in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9342407">https://stackoverflow.com/a/9342407</a>
 */
public class APIzator9342407 {

  public static void zoom(
    int imageHeight,
    BufferedImage originalImage,
    int imageType,
    int zoomLevel,
    int imageWidth
  ) throws Exception {
    int newImageWidth = imageWidth * zoomLevel;
    int newImageHeight = imageHeight * zoomLevel;
    BufferedImage resizedImage = new BufferedImage(
      newImageWidth,
      newImageHeight,
      imageType
    );
    Graphics2D g = resizedImage.createGraphics();
    g.drawImage(originalImage, 0, 0, newImageWidth, newImageHeight, null);
    g.dispose();
  }
}
