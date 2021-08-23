package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

/**
 * How to add multiple ActionListeners for multiple buttons in Java Swing
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5911621">https://stackoverflow.com/a/5911621</a>
 */
public class APIzator5911621 {

  public static void addActionlisteners() throws Exception {
    JButton addButton = new JButton(
      new AbstractAction("add") {
        @Override
        public void actionPerformed(ActionEvent e) {
          // add Action
        }
      }
    );
    JButton substractButton = new JButton(
      new AbstractAction("substract") {
        @Override
        public void actionPerformed(ActionEvent e) {
          // substract Action
        }
      }
    );
  }
}
