package com.stackoverflow.api;

import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

/**
 * Making a JScrollPane automatically scroll all the way down
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2483824">https://stackoverflow.com/a/2483824</a>
 */
public class APIzator2483824 {

  public static void make() throws Exception {
    JTextArea textArea = new JTextArea();
    DefaultCaret caret = (DefaultCaret) textArea.getCaret();
    caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
  }
}
