package com.stackoverflow.api;

import javax.swing.JRadioButton;

/**
 * How to get value of selected radioButton of buttonGroup
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25824882">https://stackoverflow.com/a/25824882</a>
 */
public class APIzator25824882 {

  public static void getValue() throws Exception {
    JRadioButton maleButton = new JRadioButton("Male");
    maleButton.setActionCommand(maleButton.getText());
  }
}
