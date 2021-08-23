package com.stackoverflow.api;

/**
 * How to format an elapsed time interval in hh:mm:ss.SSS format in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6711693">https://stackoverflow.com/a/6711693</a>
 */
public class APIzator6711693 {

  public static String formatMillis(long val) {
    StringBuilder buf = new StringBuilder(20);
    String sgn = "";
    if (val < 0) {
      sgn = "-";
      val = Math.abs(val);
    }
    append(buf, sgn, 0, (val / 3600000));
    val %= 3600000;
    append(buf, ":", 2, (val / 60000));
    val %= 60000;
    append(buf, ":", 2, (val / 1000));
    val %= 1000;
    append(buf, ".", 3, (val));
    return buf.toString();
  }

  /**
   * Append a right-aligned and zero-padded numeric value to a `StringBuilder`.
   */
  private static void append(StringBuilder tgt, String pfx, int dgt, long val) {
    tgt.append(pfx);
    if (dgt > 1) {
      int pad = (dgt - 1);
      for (long xa = val; xa > 9 && pad > 0; xa /= 10) {
        pad--;
      }
      for (int xa = 0; xa < pad; xa++) {
        tgt.append('0');
      }
    }
    tgt.append(val);
  }
}
