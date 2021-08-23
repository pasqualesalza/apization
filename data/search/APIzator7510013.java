package com.stackoverflow.api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * How can I find out which button was clicked?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7510013">https://stackoverflow.com/a/7510013</a>
 */
public class APIzator7510013 {

  public static ActionListener find() throws Exception {
    return new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
      }
    };
  }
}
