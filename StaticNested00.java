package net.aab.TestApps;

public class StaticNested00 {
    public static void main(String[] args) {
        new TopLevel.NestedLevelOne().getK();
    }
}

class TopLevel {
    private static int k = 0;
    static class NestedLevelOne {
        int getK(){
            return k;
        }
    }
}
