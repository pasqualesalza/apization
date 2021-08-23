package com.stackoverflow.api;

/**
 * How should I load native libraries for JNI to avoid an UnsatisfiedLinkError?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/903982">https://stackoverflow.com/a/903982</a>
 */
public class APIzator903982 {

  public static void loadLibrary() throws Exception {
    System.loadLibrary("hello");
  }
}
