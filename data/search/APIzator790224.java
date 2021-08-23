package com.stackoverflow.api;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Java - How to create a custom dialog box?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/790224">https://stackoverflow.com/a/790224</a>
 */
public class APIzator790224 {

  public static void createBox() throws Exception {
    JTextField firstName = new JTextField();
    JTextField lastName = new JTextField();
    JPasswordField password = new JPasswordField();
    final JComponent[] inputs = new JComponent[] {
      new JLabel("First"),
      firstName,
      new JLabel("Last"),
      lastName,
      new JLabel("Password"),
      password,
    };
    int result = JOptionPane.showConfirmDialog(
      null,
      inputs,
      "My custom dialog",
      JOptionPane.PLAIN_MESSAGE
    );
    if (result == JOptionPane.OK_OPTION) {
      System.out.println(
        "You entered " +
        firstName.getText() +
        ", " +
        lastName.getText() +
        ", " +
        password.getText()
      );
    } else {
      System.out.println(
        "User canceled / closed the dialog, result = " + result
      );
    }
  }
}
