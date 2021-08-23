package com.stackoverflow.api;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 * How to create a JButton with a menu?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1693326">https://stackoverflow.com/a/1693326</a>
 */
public class APIzator1693326 {

  public static void createJbutton() {
    final JFrame frame = new JFrame();
    frame.setPreferredSize(new Dimension(600, 400));
    final JToolBar toolBar = new JToolBar();
    // Create the popup menu.
    final JPopupMenu popup = new JPopupMenu();
    popup.add(
      new JMenuItem(
        new AbstractAction("Option 1") {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Option 1 selected");
          }
        }
      )
    );
    popup.add(
      new JMenuItem(
        new AbstractAction("Option 2") {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Option 2 selected");
          }
        }
      )
    );
    final JButton button = new JButton("Options");
    button.addMouseListener(
      new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          popup.show(e.getComponent(), e.getX(), e.getY());
        }
      }
    );
    toolBar.add(button);
    frame.getContentPane().add(toolBar, BorderLayout.NORTH);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
