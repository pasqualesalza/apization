package com.stackoverflow.api;

/**
 * How do I change the default application icon in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/209824">https://stackoverflow.com/a/209824</a>
 */
public class APIzator209824 {

  public static java.net.URL changeIcon() throws Exception {
    return ClassLoader.getSystemResource("com/xyz/resources/camera.png");
  }
}
