package com.stackoverflow.api;

/**
 * How to rotate a vertex around a certain point?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12161405">https://stackoverflow.com/a/12161405</a>
 */
public class APIzator12161405 {

  public static void rotateVertex(
    double newX,
    double newY,
    int point2x,
    int point2y,
    int x,
    int centerX,
    int centerY
  ) throws Exception {
    newX =
      centerX +
      (point2x - centerX) *
      Math.cos(x) -
      (point2y - centerY) *
      Math.sin(x);
    newY =
      centerY +
      (point2x - centerX) *
      Math.sin(x) +
      (point2y - centerY) *
      Math.cos(x);
  }
}
