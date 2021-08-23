package com.stackoverflow.api;

import javax.swing.JOptionPane;

/**
 * JOptionPane YES/No Options Confirm Dialog Box Issue
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8689130">https://stackoverflow.com/a/8689130</a>
 */
public class APIzator8689130 {

  public static void joptionpane(int dialogButton) throws Exception {
    int dialogResult = JOptionPane.showConfirmDialog(
      null,
      "Would You Like to Save your Previous Note First?",
      "Warning",
      dialogButton
    );
    if (dialogResult == JOptionPane.YES_OPTION) {
      // Saving code here
    }
  }
}
