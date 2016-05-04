package net.aab.TestApps;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class IOApps001 {
    public static void main(String[] args) throws IOException {
        OutputStream osFOS = new FileOutputStream("d:/tmp.bin");
        OutputStream osBOS = new BufferedOutputStream(osFOS);
        OutputStream osGZIPOS = new GZIPOutputStream(osBOS);
    }
}
