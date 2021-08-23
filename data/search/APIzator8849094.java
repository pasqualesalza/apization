package com.stackoverflow.api;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Adding a Scrollable JTextArea (Java)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8849094">https://stackoverflow.com/a/8849094</a>
 */
public class APIzator8849094 {

  public static void addJtextarea() throws Exception {
    JFrame frame = new JFrame("Test");
    JTextArea textArea = new JTextArea("Test");
    JScrollPane scroll = new JScrollPane(
      textArea,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
    );
    frame.add(scroll);
    frame.setVisible(true);
  }
}
