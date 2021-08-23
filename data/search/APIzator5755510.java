package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Java List.add() UnsupportedOperationException
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5755510">https://stackoverflow.com/a/5755510</a>
 */
public class APIzator5755510 {

  public static void listadd(Collection seeAlso) throws Exception {
    seeAlso = new ArrayList<>(seeAlso);
  }
}
