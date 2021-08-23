package com.stackoverflow.api;

import java.io.*;
import java.net.*;

/**
 * How to convert the DataInputStream to the String in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3871163">https://stackoverflow.com/a/3871163</a>
 */
public class APIzator3871163 {

  public static void convertDatainputstream() {
    try {
      URL google = new URL("http://www.google.com/");
      URLConnection googleConnection = google.openConnection();
      DataInputStream dis = new DataInputStream(
        googleConnection.getInputStream()
      );
      StringBuffer inputLine = new StringBuffer();
      String tmp;
      while ((tmp = dis.readLine()) != null) {
        inputLine.append(tmp);
        System.out.println(tmp);
      }
      // use inputLine.toString(); here it would have whole source
      dis.close();
    } catch (MalformedURLException me) {
      System.out.println("MalformedURLException: " + me);
    } catch (IOException ioe) {
      System.out.println("IOException: " + ioe);
    }
  }
}
