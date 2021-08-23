package com.stackoverflow.api;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * How can I check if a method is static using reflection?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/287654">https://stackoverflow.com/a/287654</a>
 */
public class APIzator287654 {

  /**
   * Returns the public static methods of a class or interface,
   *   including those declared in super classes and interfaces.
   */
  public static List<Method> getStaticMethods(Class<?> clazz) {
    List<Method> methods = new ArrayList<Method>();
    for (Method method : clazz.getMethods()) {
      if (Modifier.isStatic(method.getModifiers())) {
        methods.add(method);
      }
    }
    return Collections.unmodifiableList(methods);
  }
}
