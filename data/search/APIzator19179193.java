package com.stackoverflow.api;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Java - Read file and split into multiple files
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19179193">https://stackoverflow.com/a/19179193</a>
 */
public class APIzator19179193 {

  public static void file(long numSplits, int maxReadBufferSize)
    throws Exception {
    RandomAccessFile raf = new RandomAccessFile("test.csv", "r");
    long sourceSize = raf.length();
    long bytesPerSplit = sourceSize / numSplits;
    long remainingBytes = sourceSize % numSplits;
    for (int destIx = 1; destIx <= numSplits; destIx++) {
      BufferedOutputStream bw = new BufferedOutputStream(
        new FileOutputStream("split." + destIx)
      );
      if (bytesPerSplit > maxReadBufferSize) {
        long numReads = bytesPerSplit / maxReadBufferSize;
        long numRemainingRead = bytesPerSplit % maxReadBufferSize;
        for (int i = 0; i < numReads; i++) {
          readWrite(raf, bw, maxReadBufferSize);
        }
        if (numRemainingRead > 0) {
          readWrite(raf, bw, numRemainingRead);
        }
      } else {
        readWrite(raf, bw, bytesPerSplit);
      }
      bw.close();
    }
    if (remainingBytes > 0) {
      BufferedOutputStream bw = new BufferedOutputStream(
        new FileOutputStream("split." + (numSplits + 1))
      );
      readWrite(raf, bw, remainingBytes);
      bw.close();
    }
    raf.close();
  }

  static void readWrite(
    RandomAccessFile raf,
    BufferedOutputStream bw,
    long numBytes
  ) throws IOException {
    byte[] buf = new byte[(int) numBytes];
    int val = raf.read(buf);
    if (val != -1) {
      bw.write(buf);
    }
  }
}
