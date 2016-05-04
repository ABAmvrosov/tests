package net.aab.TestApps;

import java.util.Arrays;

public final class Char006 {
    public static void main(String[] args) throws Exception{
        System.out.println(Arrays.toString("A".getBytes("UTF-16")));
        System.out.println(Arrays.toString("AA".getBytes("UTF-16")));
        System.out.println(Arrays.toString("AAA".getBytes("UTF-16")));
    }
}

