package net.aab.TestApps;

import java.util.ArrayList;
import java.util.List;

public class xx extends Xx_parent{
    void method() {}
    public static void main(String[] args) throws Exception {
        Xx_parent x = new xx();
        x.method();
    }
}

class Xx_parent {
        void method() throws Exception {}
        }

