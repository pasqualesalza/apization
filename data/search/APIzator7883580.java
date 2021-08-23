package com.stackoverflow.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Getting the computer name in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7883580">https://stackoverflow.com/a/7883580</a>
 */
public class APIzator7883580 {

  public static void getName() throws Exception {
    String hostname = "Unknown";
    try {
      InetAddress addr;
      addr = InetAddress.getLocalHost();
      hostname = addr.getHostName();
    } catch (UnknownHostException ex) {
      System.out.println("Hostname can not be resolved");
    }
  }
}
