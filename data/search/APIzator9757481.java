package com.stackoverflow.api;

/**
 * Java Native Interface 32 bit dll on 64 bit system
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9757481">https://stackoverflow.com/a/9757481</a>
 */
public class APIzator9757481 {

  public static void interface_(int libraryName) throws Exception {
    String archDataModel = System.getProperty("sun.arch.data.model");
    System.loadLibrary(libraryName + archDataModel);
  }
}
