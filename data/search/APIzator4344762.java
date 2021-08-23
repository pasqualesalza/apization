package com.stackoverflow.api;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;

/**
 * Double-click event on JList element
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4344762">https://stackoverflow.com/a/4344762</a>
 */
public class APIzator4344762 {

  public static void event(String[] items) throws Exception {
    JList list = new JList(items);
    list.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
          JList list = (JList) evt.getSource();
          if (evt.getClickCount() == 2) {
            // Double-click detected
            int index = list.locationToIndex(evt.getPoint());
          } else if (evt.getClickCount() == 3) {
            // Triple-click detected
            int index = list.locationToIndex(evt.getPoint());
          }
        }
      }
    );
  }
}
