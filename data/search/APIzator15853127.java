package com.stackoverflow.api;

import javax.swing.JOptionPane;

/**
 * JOptionPane YES NO OPTION
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15853127">https://stackoverflow.com/a/15853127</a>
 */
public class APIzator15853127 {

  public static void yes(int dialogButton) throws Exception {
    dialogButton =
      JOptionPane.showConfirmDialog(
        null,
        "Are you sure?",
        "WARNING",
        dialogButton
      );
    if (
      JOptionPane.showConfirmDialog(
        null,
        "Are you sure?",
        "WARNING",
        JOptionPane.YES_NO_OPTION
      ) ==
      JOptionPane.YES_OPTION
    ) {
      // yes option
    } else {
      // no option
    }
  }
}
