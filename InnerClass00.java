package net.aab.TestApps;

public class InnerClass00 {
    public static void main(String[] args) {
        TopLevel00 topLevel00 = new TopLevel00();
        TopLevel00.Inner inner = topLevel00.new Inner();
    }
}

class TopLevel00 {
    class Inner {
    }
}
