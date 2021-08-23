package com.stackoverflow.api;

import javax.swing.JFileChooser;

/**
 * How to get full path directory from File Chooser
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10621739">https://stackoverflow.com/a/10621739</a>
 */
public class APIzator10621739 {

  public static void getDirectory() throws Exception {
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle("choosertitle");
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      System.out.println(
        "getCurrentDirectory(): " + chooser.getCurrentDirectory()
      );
      System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
    } else {
      System.out.println("No Selection ");
    }
  }
}
