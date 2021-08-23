package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

/**
 * Swing: how do I close a dialog when the ESC key is pressed?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/642934">https://stackoverflow.com/a/642934</a>
 */
public class APIzator642934 {

  private static final KeyStroke escapeStroke = KeyStroke.getKeyStroke(
    KeyEvent.VK_ESCAPE,
    0
  );

  public static final String dispatchWindowClosingActionMapKey =
    "com.spodding.tackline.dispatch:WINDOW_CLOSING";

  public static void installEscapeCloseOperation(final JDialog dialog) {
    Action dispatchClosing = new AbstractAction() {
      public void actionPerformed(ActionEvent event) {
        dialog.dispatchEvent(
          new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING)
        );
      }
    };
    JRootPane root = dialog.getRootPane();
    root
      .getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
      .put(escapeStroke, dispatchWindowClosingActionMapKey);
    root.getActionMap().put(dispatchWindowClosingActionMapKey, dispatchClosing);
  }
}
