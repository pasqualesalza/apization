package com.stackoverflow.api;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 * Flip Image with Graphics2D
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9559043">https://stackoverflow.com/a/9559043</a>
 */
public class APIzator9559043 {

  public static void image(BufferedImage image) throws Exception {
    // Flip the image vertically
    AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
    tx.translate(0, -image.getHeight(null));
    AffineTransformOp op = new AffineTransformOp(
      tx,
      AffineTransformOp.TYPE_NEAREST_NEIGHBOR
    );
    image = op.filter(image, null);
    // Flip the image horizontally
    tx = AffineTransform.getScaleInstance(-1, 1);
    tx.translate(-image.getWidth(null), 0);
    op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
    image = op.filter(image, null);
    // Flip the image vertically and horizontally; equivalent to rotating the image 180 degrees
    tx = AffineTransform.getScaleInstance(-1, -1);
    tx.translate(-image.getWidth(null), -image.getHeight(null));
    op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
    image = op.filter(image, null);
  }
}
