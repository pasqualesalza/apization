package com.stackoverflow.api;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 * How do I use the Button Group Swing control in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2301155">https://stackoverflow.com/a/2301155</a>
 */
public class APIzator2301155 {

  public static void useControl(String birdString, String catString)
    throws Exception {
    JRadioButton birdButton = new JRadioButton(birdString);
    birdButton.setSelected(true);
    JRadioButton catButton = new JRadioButton(catString);
    // Group the radio buttons.
    ButtonGroup group = new ButtonGroup();
    group.add(birdButton);
    group.add(catButton);
  }
}
