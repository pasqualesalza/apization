package com.stackoverflow.api;

import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JList;

/**
 * How to change the mouse cursor in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7359252">https://stackoverflow.com/a/7359252</a>
 */
public class APIzator7359252 {

  public static void changeCursor(JList list) throws Exception {
    list.addMouseMotionListener(
      new MouseMotionListener() {
        @Override
        public void mouseMoved(MouseEvent e) {
          final int x = e.getX();
          final int y = e.getY();
          // only display a hand if the cursor is over the items
          final Rectangle cellBounds = list.getCellBounds(
            0,
            list.getModel().getSize() - 1
          );
          if (cellBounds != null && cellBounds.contains(x, y)) {
            list.setCursor(new Cursor(Cursor.HAND_CURSOR));
          } else {
            list.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
          }
        }

        @Override
        public void mouseDragged(MouseEvent e) {}
      }
    );
  }
}
