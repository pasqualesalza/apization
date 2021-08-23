package com.stackoverflow.api;

/**
 * Is an array a primitive type or an object (or something else entirely)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12807748">https://stackoverflow.com/a/12807748</a>
 */
public class APIzator12807748 {

  public static void be() {
    test(int[].class);
    test(String[].class);
  }

  static void test(Class clazz) {
    System.out.println(clazz.getName());
    System.out.println(clazz.getSuperclass());
    for (Class face : clazz.getInterfaces()) System.out.println(face);
  }
}
