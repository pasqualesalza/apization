package com.stackoverflow.api;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;

/**
 * How to rotate log files based on time rather than size in Log4j?
 *
 * classpath: log4j-1.2.17
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1711441">https://stackoverflow.com/a/1711441</a>
 */
public class APIzator1711441 {

  public static void rotateFile() throws Exception {
    DailyRollingFileAppender appender = new DailyRollingFileAppender();
    appender.setDatePattern("'.'yyyy-MM-dd-HH");
    Logger root = Logger.getRootLogger();
    root.addAppender(appender);
  }
}
