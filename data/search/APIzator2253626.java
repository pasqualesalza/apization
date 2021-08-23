package com.stackoverflow.api;

import javax.swing.AbstractButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 * How to manage two JRadioButtons in java so that only one of them can be selected at a time
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2253626">https://stackoverflow.com/a/2253626</a>
 */
public class APIzator2253626 {

  public static void manageJradiobutton(
    AbstractButton catButton,
    AbstractButton birdButton
  ) throws Exception {
    ButtonGroup group = new ButtonGroup();
    group.add(birdButton);
    group.add(catButton);
  }
}
