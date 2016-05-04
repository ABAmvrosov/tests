package net.aab.TestApps;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Char002 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = new String(new byte[]{65, 66, 67});
        byte[] raw1 = str.getBytes("ASCII");
        byte[] raw2 = str.getBytes("UTF-16");
        for (byte aByte : raw1) {
            System.out.print(aByte + " ");
        }
        System.out.println();
        for (byte aByte : raw2) {
            System.out.print(aByte + " ");
        }
    }
}
