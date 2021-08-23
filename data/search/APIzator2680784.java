package com.stackoverflow.api;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * Catching java.lang.OutOfMemoryError?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2680784">https://stackoverflow.com/a/2680784</a>
 */
public class APIzator2680784 {

  private static final int MEGABYTE = (1024 * 1024);

  public static void runOutOfMemory() {
    MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
    for (int i = 1; i <= 100; i++) {
      try {
        byte[] bytes = new byte[MEGABYTE * 500];
      } catch (Exception e) {
        e.printStackTrace();
      } catch (OutOfMemoryError e) {
        MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
        long maxMemory = heapUsage.getMax() / MEGABYTE;
        long usedMemory = heapUsage.getUsed() / MEGABYTE;
        System.out.println(
          i + " : Memory Use :" + usedMemory + "M/" + maxMemory + "M"
        );
      }
    }
  }
}
