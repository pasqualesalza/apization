package com.stackoverflow.api;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Setting the height of a row in a JTable in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15854416">https://stackoverflow.com/a/15854416</a>
 */
public class APIzator15854416 {

  private static void createAndShowGUI() {
    JFrame frame = new JFrame("DemoTable");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(
      new Object[] { "Column 1", "Column 2", "Column 3" }
    );
    JTable table = new JTable(model);
    for (int count = 0; count < 3; count++) {
      model.insertRow(count, new Object[] { count, "name", "age" });
    }
    table.setRowHeight(1, 30);
    frame.add(new JScrollPane(table));
    frame.setLocationByPlatform(true);
    frame.pack();
    frame.setVisible(true);
  }

  public static void setHeight() {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          createAndShowGUI();
        }
      }
    );
  }
}
