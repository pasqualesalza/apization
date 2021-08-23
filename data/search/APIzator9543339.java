package com.stackoverflow.api;

import java.awt.Component;
import javax.swing.JFrame;

/**
 * How to position the form in the center screen?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9543339">https://stackoverflow.com/a/9543339</a>
 */
public class APIzator9543339 {

  public static void positionForm(Component mainPanel) throws Exception {
    JFrame frame = new JFrame("FooRendererTest");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // or whatever...
    frame.getContentPane().add(mainPanel);
    frame.pack();
    // *** this will center your app ***
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
