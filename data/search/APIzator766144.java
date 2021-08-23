package com.stackoverflow.api;

import org.hibernate.type.AnyType;

/**
 * Test if object implements interface
 *
 * classpath: hibernate-core-5.3.7.Final
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/766144">https://stackoverflow.com/a/766144</a>
 */
public class APIzator766144 {

  public static void test() throws Exception {
    if ("" instanceof java.io.Serializable) {
      // it's true
    }
    if (null instanceof AnyType) {
      // never reached
    }
  }
}
