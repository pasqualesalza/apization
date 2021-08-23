package com.stackoverflow.api;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * JOptionPane to get password
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8881235">https://stackoverflow.com/a/8881235</a>
 */
public class APIzator8881235 {

  public static void joptionpane(String[] options) throws Exception {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Enter a password:");
    JPasswordField pass = new JPasswordField(10);
    panel.add(label);
    panel.add(pass);
    int option = JOptionPane.showOptionDialog(
      null,
      panel,
      "The title",
      JOptionPane.NO_OPTION,
      JOptionPane.PLAIN_MESSAGE,
      null,
      options,
      options[1]
    );
    if ( // pressing OK button
      option == 0
    ) {
      char[] password = pass.getPassword();
      System.out.println("Your password is: " + new String(password));
    }
  }
}
