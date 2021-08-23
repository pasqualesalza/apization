package com.stackoverflow.api;

import java.awt.Toolkit;
import java.awt.datatransfer.*;

/**
 * Copying text to the clipboard using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6713290">https://stackoverflow.com/a/6713290</a>
 */
public class APIzator6713290 {

  public static void copyText(String myString) throws Exception {
    StringSelection stringSelection = new StringSelection(myString);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
  }
}
