package com.stackoverflow.api;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * How to show/hide JPanels in a JFrame?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4286828">https://stackoverflow.com/a/4286828</a>
 */
public class APIzator4286828 {

  public static void show() {
    JFrame f = new JFrame();
    f.setLayout(new BorderLayout());
    final JPanel p = new JPanel();
    p.add(new JLabel("A Panel"));
    f.add(p, BorderLayout.CENTER);
    // create a button which will hide the panel when clicked.
    JButton b = new JButton("HIDE");
    b.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          p.setVisible(false);
        }
      }
    );
    f.add(b, BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
  }
}
