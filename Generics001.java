package net.aab.TestApps;

import java.util.ArrayList;

public class Generics001 {
    public static void main(String[] args) {
        ArrayList<? extends Number> ref = new ArrayList<>();
        Number var = null;
//        ref.add(var);
    }
}
