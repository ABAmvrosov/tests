package net.aab.TestApps;

import java.io.FileNotFoundException;

public class Exceptions001 {
    public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        } finally {
            try {
                throw new Exception();
            } catch (Exception e) {
            }
        }
    }
}
