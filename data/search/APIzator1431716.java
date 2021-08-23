package com.stackoverflow.api;

import com.impossibl.postgres.api.data.Record;
import java.util.Collections;
import java.util.List;
import java.util.List;

/**
 * Correct way to synchronize ArrayList in java
 *
 * classpath: pgjdbc-ng-0.7.1
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1431716">https://stackoverflow.com/a/1431716</a>
 */
public class APIzator1431716 {

  public static void way(List in_queue) throws Exception {
    List<Record> in_queue_list = Collections.synchronizedList(in_queue);
    // synchronized implicitly,
    in_queue_list.clear();
  }
}
