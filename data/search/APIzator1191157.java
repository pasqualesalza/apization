package com.stackoverflow.api;

/**
 * Java -Xmx, Max memory on system
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1191157">https://stackoverflow.com/a/1191157</a>
 */
public class APIzator1191157 {

  public static long xmx() throws Exception {
    java.lang.management.OperatingSystemMXBean mxbean = java.lang.management.ManagementFactory.getOperatingSystemMXBean();
    com.sun.management.OperatingSystemMXBean sunmxbean = (com.sun.management.OperatingSystemMXBean) mxbean;
    long freeMemory = sunmxbean.getFreePhysicalMemorySize();
    return sunmxbean.getTotalPhysicalMemorySize();
  }
}
