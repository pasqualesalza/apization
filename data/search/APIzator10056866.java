package com.stackoverflow.api;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/**
 * set timeout for socket receive
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10056866">https://stackoverflow.com/a/10056866</a>
 */
public class APIzator10056866 {

  public static void setTimeout(String outString) throws Exception {
    DatagramSocket s;
    try {
      s = new DatagramSocket();
      byte[] buf = new byte[1000];
      DatagramPacket dp = new DatagramPacket(buf, buf.length);
      InetAddress hostAddress = InetAddress.getByName("localhost");
      buf = outString.getBytes();
      DatagramPacket out = new DatagramPacket(
        buf,
        buf.length,
        hostAddress,
        9999
      );
      // send to the server
      s.send(out);
      // set the timeout in millisecounds.
      s.setSoTimeout(1000);
      while (true) {
        // recieve data until timeout
        try {
          s.receive(dp);
          String rcvd =
            "rcvd from " +
            dp.getAddress() +
            ", " +
            dp.getPort() +
            ": " +
            new String(dp.getData(), 0, dp.getLength());
          System.out.println(rcvd);
        } catch (SocketTimeoutException e) {
          // timeout exception.
          System.out.println("Timeout reached!!! " + e);
          s.close();
        }
      }
    } catch (SocketException e1) {
      // TODO Auto-generated catch block
      // e1.printStackTrace();
      System.out.println("Socket closed " + e1);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
