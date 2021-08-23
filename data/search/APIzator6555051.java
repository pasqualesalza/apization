package com.stackoverflow.api;

import javax.swing.*;

/**
 * Multiple input in JOptionPane.showInputDialog
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6555051">https://stackoverflow.com/a/6555051</a>
 */
public class APIzator6555051 {

  public static void input() {
    JTextField xField = new JTextField(5);
    JTextField yField = new JTextField(5);
    JPanel myPanel = new JPanel();
    myPanel.add(new JLabel("x:"));
    myPanel.add(xField);
    // a spacer
    myPanel.add(Box.createHorizontalStrut(15));
    myPanel.add(new JLabel("y:"));
    myPanel.add(yField);
    int result = JOptionPane.showConfirmDialog(
      null,
      myPanel,
      "Please Enter X and Y Values",
      JOptionPane.OK_CANCEL_OPTION
    );
    if (result == JOptionPane.OK_OPTION) {
      System.out.println("x value: " + xField.getText());
      System.out.println("y value: " + yField.getText());
    }
  }
}
