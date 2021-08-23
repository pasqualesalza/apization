package com.stackoverflow.api;

/**
 * Trying to use DLL from Java (JNA). Unable to load library exception
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14288621">https://stackoverflow.com/a/14288621</a>
 */
public class APIzator14288621 {

  public static void try_() throws Exception {
    // or another absolute or relative path
    String myLibraryPath = System.getProperty("user.dir");
    System.setProperty("java.library.path", myLibraryPath);
  }
}
