package com.stackoverflow.api;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 * How can I use a custom font in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5652385">https://stackoverflow.com/a/5652385</a>
 */
public class APIzator5652385 {

  public static void useFont(String str1) throws Exception {
    try {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(str1)));
    } catch (IOException | FontFormatException e) {
      // Handle exception
    }
  }
}
