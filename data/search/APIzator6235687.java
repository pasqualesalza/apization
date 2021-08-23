package com.stackoverflow.api;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * JList - select multiple items
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6235687">https://stackoverflow.com/a/6235687</a>
 */
public class APIzator6235687 {

  public static void item() throws Exception {
    File f = new File("MultiSelectList.java");
    InputStream is = new FileInputStream(f);
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    final ArrayList<String> lines = new ArrayList<String>();
    String line = br.readLine();
    while (line != null) {
      lines.add(line);
      line = br.readLine();
    }
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JList list = new JList(lines.toArray());
          list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
          int[] select = { 19, 20, 22 };
          list.setSelectedIndices(select);
          JOptionPane.showMessageDialog(null, new JScrollPane(list));
        }
      }
    );
  }
}
