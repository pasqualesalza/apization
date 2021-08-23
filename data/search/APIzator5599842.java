package com.stackoverflow.api;

import java.text.DecimalFormat;

/**
 * Format file size as MB, GB etc
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5599842">https://stackoverflow.com/a/5599842</a>
 */
public class APIzator5599842 {

  public static String readableFileSize(long size) {
    if (size <= 0) return "0";
    final String[] units = new String[] { "B", "kB", "MB", "GB", "TB" };
    int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
    return (
      new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) +
      " " +
      units[digitGroups]
    );
  }
}
