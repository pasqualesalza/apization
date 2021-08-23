package com.stackoverflow.api;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JToggleButton;

/**
 * Getting the state of JToggleButton
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7524627">https://stackoverflow.com/a/7524627</a>
 */
public class APIzator7524627 {

  public static void getState() throws Exception {
    JToggleButton jtb = new JToggleButton("Press Me");
    jtb.addItemListener(
      new ItemListener() {
        public void itemStateChanged(ItemEvent ev) {
          if (ev.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("button is selected");
          } else if (ev.getStateChange() == ItemEvent.DESELECTED) {
            System.out.println("button is not selected");
          }
        }
      }
    );
    System.out.println(jtb.isSelected());
    if (jtb.isSelected()) {
      System.out.println("button is selected");
    } else {
      System.out.println("button is not selected");
    }
  }
}
