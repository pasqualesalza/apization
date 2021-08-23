package com.stackoverflow.api;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.*;

/**
 * Simple popup java form with at least two fields
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3002830">https://stackoverflow.com/a/3002830</a>
 */
/**
 * @see https://stackoverflow.com/a/3002830/230513
 */
public class APIzator3002830 {

  private static void display() {
    String[] items = { "One", "Two", "Three", "Four", "Five" };
    JComboBox<String> combo = new JComboBox<>(items);
    JTextField field1 = new JTextField("1234.56");
    JTextField field2 = new JTextField("9876.54");
    JPanel panel = new JPanel(new GridLayout(0, 1));
    panel.add(combo);
    panel.add(new JLabel("Field 1:"));
    panel.add(field1);
    panel.add(new JLabel("Field 2:"));
    panel.add(field2);
    int result = JOptionPane.showConfirmDialog(
      null,
      panel,
      "Test",
      JOptionPane.OK_CANCEL_OPTION,
      JOptionPane.PLAIN_MESSAGE
    );
    if (result == JOptionPane.OK_OPTION) {
      System.out.println(
        combo.getSelectedItem() +
        " " +
        field1.getText() +
        " " +
        field2.getText()
      );
    } else {
      System.out.println("Cancelled");
    }
  }

  public static void form() {
    EventQueue.invokeLater(
      new Runnable() {
        @Override
        public void run() {
          display();
        }
      }
    );
  }
}
