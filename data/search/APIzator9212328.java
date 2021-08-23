package com.stackoverflow.api;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * java BoxLayout panel's alignment
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9212328">https://stackoverflow.com/a/9212328</a>
 */
public class APIzator9212328 {

  public static int alignment() throws Exception {
    JPanel a = new JPanel();
    JPanel b = new JPanel();
    JPanel c = new JPanel();
    a.setBackground(Color.RED);
    b.setBackground(Color.GREEN);
    c.setBackground(Color.BLUE);
    a.setMaximumSize(new Dimension(10, 10));
    b.setMaximumSize(new Dimension(50, 10));
    // 0.0
    a.setAlignmentX(Component.LEFT_ALIGNMENT);
    // 0.0
    b.setAlignmentX(Component.LEFT_ALIGNMENT);
    // 0.0
    c.setAlignmentX(Component.LEFT_ALIGNMENT);
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(a);
    panel.add(b);
    panel.add(c);
    return JOptionPane.showConfirmDialog(
      null,
      panel,
      "Please enter values.",
      JOptionPane.OK_CANCEL_OPTION
    );
  }
}
