package com.stackoverflow.api;

import java.awt.*;
import javax.swing.*;

/**
 * Setting background color to JButton
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18165308">https://stackoverflow.com/a/18165308</a>
 */
public class APIzator18165308 {

  public static void setColor() {
    Runnable r = new Runnable() {
      @Override
      public void run() {
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
          e.printStackTrace();
        }
        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.RED);
        // these next two lines do the magic..
        b1.setContentAreaFilled(false);
        b1.setOpaque(true);
        JOptionPane.showMessageDialog(null, b1);
      }
    };
    SwingUtilities.invokeLater(r);
  }
}
