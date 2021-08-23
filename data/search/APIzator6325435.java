package com.stackoverflow.api;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * adding multiple jPanels to jFrame
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6325435">https://stackoverflow.com/a/6325435</a>
 */
public class APIzator6325435 {

  public static void addJpanel() throws Exception {
    JPanel container = new JPanel();
    container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    // panel1.set[Preferred/Maximum/Minimum]Size()
    container.add(panel1);
    container.add(panel2);
  }
}
