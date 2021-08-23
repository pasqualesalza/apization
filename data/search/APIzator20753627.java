package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Creating, writing and editing same text file in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20753627">https://stackoverflow.com/a/20753627</a>
 */
public class APIzator20753627 {

  public static void create(String str1) {
    try {
      String verify, putData;
      File file = new File(str1);
      file.createNewFile();
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Some text here for a reason");
      bw.flush();
      bw.close();
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      while ((verify = br.readLine()) != null) {
        // ***editted
        // **deleted**verify = br.readLine();**
        if (verify != null) {
          // ***edited
          putData = verify.replaceAll("here", "there");
          bw.write(putData);
        }
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
