package com.stackoverflow.api;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

/**
 * Java2D: Increase the line width
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2839517">https://stackoverflow.com/a/2839517</a>
 */
public class APIzator2839517 {

  public static void java2d() {
    JFrame jf = new JFrame("Demo");
    Container cp = jf.getContentPane();
    cp.add(
      new JComponent() {
        public void paintComponent(Graphics g) {
          Graphics2D g2 = (Graphics2D) g;
          g2.setStroke(new BasicStroke(10));
          g2.draw(new Line2D.Float(30, 20, 80, 90));
        }
      }
    );
    jf.setSize(300, 200);
    jf.setVisible(true);
  }
}
