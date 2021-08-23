package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * Detect enter press in JTextField
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4420301">https://stackoverflow.com/a/4420301</a>
 */
public class APIzator4420301 {

  public static void enterPress() throws Exception {
    Action action = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("some action");
      }
    };
    JTextField textField = new JTextField(10);
    textField.addActionListener(action);
    JButton button = new JButton("Do Something");
    button.addActionListener(action);
  }
}
