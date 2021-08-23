package com.stackoverflow.api;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.ajoberstar.grgit.Person;

/**
 * How can I determine the type of a generic field in Java?
 *
 * classpath: grgit-1.7.2
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1868375">https://stackoverflow.com/a/1868375</a>
 */
public class APIzator1868375 {

  public static void determineType() throws Exception {
    for (Field field : Person.class.getDeclaredFields()) {
      System.out.format("Type: %s%n", field.getType());
      System.out.format("GenericType: %s%n", field.getGenericType());
    }
    for (Field field : Person.class.getDeclaredFields()) {
      System.out.print("Field: " + field.getName() + " - ");
      Type type = field.getGenericType();
      if (type instanceof ParameterizedType) {
        ParameterizedType pType = (ParameterizedType) type;
        System.out.print("Raw type: " + pType.getRawType() + " - ");
        System.out.println("Type args: " + pType.getActualTypeArguments()[0]);
      } else {
        System.out.println("Type: " + field.getType());
      }
    }
  }
}
