package com.stackoverflow.api;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 * add JMenuBar to a JPanel?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4299920">https://stackoverflow.com/a/4299920</a>
 */
public class APIzator4299920 {

  public static void addJmenubar(Component menubar) throws Exception {
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(menubar, BorderLayout.NORTH);
  }
}
