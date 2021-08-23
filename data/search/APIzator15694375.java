package com.stackoverflow.api;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * How to layout multiple panels on a jFrame? (java)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15694375">https://stackoverflow.com/a/15694375</a>
 */
public class APIzator15694375 {

  public static void layoutPanel() throws Exception {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    JPanel paintPanel = new JPanel();
    JPanel textPanel = new JPanel();
    mainPanel.add(paintPanel);
    mainPanel.add(textPanel);
  }
}
