package com.stackoverflow.api;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * How to clear JTextField when mouse clicks the JTextField
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10133538">https://stackoverflow.com/a/10133538</a>
 */
public class APIzator10133538 {

  private static void createAndShowGUI() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
    final JTextField textField = new JTextField("Enter text here...");
    textField.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          textField.setText("");
        }
      }
    );
    frame.add(textField);
    frame.pack();
    frame.setVisible(true);
  }

  public static void clearJtextfield() {
    SwingUtilities.invokeLater(
      new Runnable() {
        @Override
        public void run() {
          createAndShowGUI();
        }
      }
    );
  }
}
