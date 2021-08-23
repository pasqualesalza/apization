package com.stackoverflow.api;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * how do I make jfilechooser only accept .txt
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15772033">https://stackoverflow.com/a/15772033</a>
 */
public class APIzator15772033 {

  public static void make() throws Exception {
    JFileChooser jf = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
      "TEXT FILES",
      "txt",
      "text"
    );
    jf.setFileFilter(filter);
  }
}
