package com.stackoverflow.api;

/**
 * Java - get element position in array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7581387">https://stackoverflow.com/a/7581387</a>
 */
public class APIzator7581387 {

  public static int getPosition(int current_package, String listPackages)
    throws Exception {
    return listPackages.indexOf(current_package);
  }
}
