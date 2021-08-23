package com.stackoverflow.api;

import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 * Add a scroll bar to a JList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15522831">https://stackoverflow.com/a/15522831</a>
 */
public class APIzator15522831 {

  public static void addBar() throws Exception {
    JScrollPane scrollPane = new JScrollPane();
    JList list = new JList();
    scrollPane.setViewportView(list);
  }
}
