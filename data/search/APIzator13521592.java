package com.stackoverflow.api;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * JFileChooser filters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13521592">https://stackoverflow.com/a/13521592</a>
 */
public class APIzator13521592 {

  public static FileFilter filter() throws Exception {
    return new FileNameExtensionFilter(
      "Image files",
      ImageIO.getReaderFileSuffixes()
    );
  }
}
