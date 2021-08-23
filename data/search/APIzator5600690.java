package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.ajoberstar.grgit.Person;

/**
 * How can I initialize an ArrayList with all zeroes in Java?
 *
 * classpath: grgit-1.7.2
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5600690">https://stackoverflow.com/a/5600690</a>
 */
public class APIzator5600690 {

  public static List<Person> initializeArraylist() throws Exception {
    List<Integer> list = new ArrayList<Integer>(Collections.nCopies(60, 0));
    return Stream.generate(Person::new).limit(60).collect(Collectors.toList());
  }
}
