package com.stackoverflow.api;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Java Swing JFrame Layout
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8661053">https://stackoverflow.com/a/8661053</a>
 */
public class APIzator8661053 {

  public static void layout() throws Exception {
    JFrame window = new JFrame();
    JPanel mainframe = new JPanel();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(0, 0, 200, 200);
    JButton jb = new JButton();
    jb.setText("Leech");
    mainframe.add(jb);
    JTextField link = new JTextField(50);
    mainframe.add(link);
    window.getContentPane().add(mainframe);
    window.pack();
    window.setVisible(true);
  }
}
