package com.stackoverflow.api;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 * Adding elements to JList in Swing Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7442516">https://stackoverflow.com/a/7442516</a>
 */
public class APIzator7442516 {

  public static void addElement() throws Exception {
    final DefaultListModel model = new DefaultListModel();
    final JList list = new JList(model);
    // another thread to update the model
    final Thread updater = new Thread() {
      /* (non-Javadoc)
       * @see java.lang.Thread#run()
       */
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          model.addElement(i);
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    };
    updater.start();
  }
}
