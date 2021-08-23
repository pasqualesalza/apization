package com.stackoverflow.api;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Best way to write String to file using java nio
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7367952">https://stackoverflow.com/a/7367952</a>
 */
public class APIzator7367952 {

  public static void writeToFileNIOWay2(File file) throws IOException {
    final int numberOfIterations = 1000000;
    final String messageToWrite = "This is a test üüüüüüööööö";
    final byte[] messageBytes = messageToWrite.getBytes(
      Charset.forName("ISO-8859-1")
    );
    final long appendSize = numberOfIterations * messageBytes.length;
    final RandomAccessFile raf = new RandomAccessFile(file, "rw");
    raf.seek(raf.length());
    final FileChannel fc = raf.getChannel();
    final MappedByteBuffer mbf = fc.map(
      FileChannel.MapMode.READ_WRITE,
      fc.position(),
      appendSize
    );
    fc.close();
    for (int i = 1; i < numberOfIterations; i++) {
      mbf.put(messageBytes);
    }
  }
}
