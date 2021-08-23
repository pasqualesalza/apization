package com.stackoverflow.api;

import java.io.Serializable;
import java.util.HashMap;

/**
 * What is the difference between canonical name, simple name and class name in Java Class?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15203417">https://stackoverflow.com/a/15203417</a>
 */
public class APIzator15203417 {

  public static String be() throws Exception {
    // primitive
    System.out.println(int.class.getName());
    System.out.println(int.class.getCanonicalName());
    System.out.println(int.class.getSimpleName());
    System.out.println();
    // class
    System.out.println(String.class.getName());
    System.out.println(String.class.getCanonicalName());
    System.out.println(String.class.getSimpleName());
    System.out.println();
    // inner class
    System.out.println(HashMap.SimpleEntry.class.getName());
    System.out.println(HashMap.SimpleEntry.class.getCanonicalName());
    System.out.println(HashMap.SimpleEntry.class.getSimpleName());
    System.out.println();
    // anonymous inner class
    System.out.println(new Serializable() {}.getClass().getName());
    System.out.println(new Serializable() {}.getClass().getCanonicalName());
    return new Serializable() {}.getClass().getSimpleName();
  }
}
