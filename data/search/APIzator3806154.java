package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * How to open a txt file and read numbers in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3806154">https://stackoverflow.com/a/3806154</a>
 */
public class APIzator3806154 {

  public static List<Integer> openFile(String str1) throws Exception {
    List<Integer> list = new ArrayList<Integer>();
    File file = new File(str1);
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
      String text = null;
      while ((text = reader.readLine()) != null) {
        list.add(Integer.parseInt(text));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {}
    }
    return list;
  }
}
