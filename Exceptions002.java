package net.aab.TestApps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions002 {
    public static void main(String[] args) throws Exception {
        try(FileInputStream input = new FileInputStream("Hello")) {

        }
    }
}
