package com.stackoverflow.api;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 * Loading a text file into a textarea
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5887380">https://stackoverflow.com/a/5887380</a>
 */
public class APIzator5887380 {

  public static void loadFile(String str1, String str2, String str3) {
    final JTextArea edit = new JTextArea(30, 60);
    edit.setText("one\ntwo\nthree");
    edit.append("\nfour\nfive");
    JButton read = new JButton(str3);
    read.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try {
            FileReader reader = new FileReader(str2);
            BufferedReader br = new BufferedReader(reader);
            edit.read(br, null);
            br.close();
            edit.requestFocus();
          } catch (Exception e2) {
            System.out.println(e2);
          }
        }
      }
    );
    JButton write = new JButton(str1);
    write.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          try {
            FileWriter writer = new FileWriter(str2);
            BufferedWriter bw = new BufferedWriter(writer);
            edit.write(bw);
            bw.close();
            edit.setText("");
            edit.requestFocus();
          } catch (Exception e2) {}
        }
      }
    );
    JFrame frame = new JFrame("TextArea Load");
    frame.getContentPane().add(new JScrollPane(edit), BorderLayout.NORTH);
    frame.getContentPane().add(read, BorderLayout.WEST);
    frame.getContentPane().add(write, BorderLayout.EAST);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
