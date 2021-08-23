package com.stackoverflow.api;

/**
 * Capitalise first letter in String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15259893">https://stackoverflow.com/a/15259893</a>
 */
public class APIzator15259893 {

  public static void capitaliseLetter(String rackingSystem)
    throws Exception {
    rackingSystem = rackingSystem.toLowerCase();
    rackingSystem.toLowerCase();
    rackingSystem =
      rackingSystem.substring(0, 1).toUpperCase() +
      rackingSystem.substring(1).toLowerCase();
  }
}
