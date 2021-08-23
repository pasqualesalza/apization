package com.stackoverflow.api;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 * How can I create a bar in the bottom of a Java app, like a status bar?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3035893">https://stackoverflow.com/a/3035893</a>
 */
public class APIzator3035893 {

  public static void createBar() throws Exception {
    JFrame frame = new JFrame();
    frame.setLayout(new BorderLayout());
    frame.setSize(200, 200);
    // create the status bar panel and shove it down the bottom of the frame
    JPanel statusPanel = new JPanel();
    statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
    frame.add(statusPanel, BorderLayout.SOUTH);
    statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
    statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
    JLabel statusLabel = new JLabel("status");
    statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
    statusPanel.add(statusLabel);
    frame.setVisible(true);
  }
}
