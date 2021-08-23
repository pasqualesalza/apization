package com.stackoverflow.api;

import java.awt.Graphics2D;

/**
 * How to draw a circle with given X and Y coordinates as the middle spot of the circle?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19387172">https://stackoverflow.com/a/19387172</a>
 */
public class APIzator19387172 {

  public static void drawCenteredCircle(Graphics2D g, int x, int y, int r) {
    x = x - (r / 2);
    y = y - (r / 2);
    g.fillOval(x, y, r, r);
  }
}
