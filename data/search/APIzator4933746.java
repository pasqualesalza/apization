package com.stackoverflow.api;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

/**
 * Detecting Windows/IE proxy setting using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4933746">https://stackoverflow.com/a/4933746</a>
 */
public class APIzator4933746 {

  public static void detectSetting() {
    try {
      System.setProperty("java.net.useSystemProxies", "true");
      List<Proxy> l = ProxySelector
        .getDefault()
        .select(new URI("http://www.yahoo.com/"));
      for (Iterator<Proxy> iter = l.iterator(); iter.hasNext();) {
        Proxy proxy = iter.next();
        System.out.println("proxy hostname : " + proxy.type());
        InetSocketAddress addr = (InetSocketAddress) proxy.address();
        if (addr == null) {
          System.out.println("No Proxy");
        } else {
          System.out.println("proxy hostname : " + addr.getHostName());
          System.out.println("proxy port : " + addr.getPort());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
